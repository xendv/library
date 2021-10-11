import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;

@Data
public class Library {
    @Singular
    private ArrayList<Book> books;
    @Singular
    private ArrayList<Author> authors;
}
