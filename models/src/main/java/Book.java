import lombok.Data;
import lombok.NonNull;

@Data
public class Book {
    @NonNull
    private int id;
    @NonNull
    private int authorId;
    //@NotNull
    //private ArrayList<Integer> authorId;
    @NonNull
    private String name;
    @NonNull
    private String genre;

}
