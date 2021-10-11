import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonStreamParser;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class LibraryFactory {
    Gson gson = new Gson();
    public Library getLibrary(String path, boolean isDB){
        Library lib = new Library();
        try{
            //reading file that contains jsons
            JsonStreamParser jsonReader = new JsonStreamParser (new FileReader(path));

            //getting books
            JsonElement e = jsonReader.next();
            Type collectionType = new TypeToken<ArrayList<Book>>(){}.getType();
            ArrayList<Book> books = gson.fromJson(e, collectionType);

            //getting authors
            e = jsonReader.next();
            collectionType = new TypeToken<ArrayList<Author>>(){}.getType();
            ArrayList<Author> authors = gson.fromJson(e, collectionType);

            lib.setBooks(books);
            lib.setAuthors(authors);
        }
        catch (FileNotFoundException e){
            System.out.println("Failed finding file");
            e.printStackTrace();
        }
        return lib;
    }
}
