public class Application {
    public static void main(String[] args){
        //System.setProperty("file.encoding", "UTF-8");
        System.setProperty("file.encoding", "1251"); // works fow Windows command line

        if(args.length < 2){
            System.out.println("You have to enter one author's full name");
        }
        else{
            LibraryFactory libraryFactory = new LibraryFactory();
            Library lib = libraryFactory.getLibrary("library.TXT",false);

            /*for (Book book: lib.getBooks()) {
                System.out.println(libraryFactory.gson.toJson(book));
            }*/

            //combining full name from console parameters
            String requestedFullName = String.join(" ", args);

            int authorId = -1;
            //searching in authors array if the author exist to get his ID
            for (Author author: lib.getAuthors()) {
                if (author.getFullName().equals(requestedFullName))
                    authorId = author.getId();
            }

            if (authorId != -1){
                // trying to find his books
                int finalAuthorId = authorId;
                if (lib.getBooks().stream().anyMatch(o -> o.getAuthorId() == finalAuthorId)){
                    System.out.println("Found following books for author " + requestedFullName+" :");
                    lib.getBooks().stream().filter(o -> o.getAuthorId() == finalAuthorId).forEach(
                            o -> {System.out.println(libraryFactory.gson.toJson(o));}
                    );
                }
                else System.out.println("No books found");
            }
            else System.out.println("No author found");
        }
    }
}
