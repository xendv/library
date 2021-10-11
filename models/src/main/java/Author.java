import lombok.Data;
import lombok.NonNull;

@Data
public class Author {
    @NonNull
    private int id;
    @NonNull
    private String fullName;
}
