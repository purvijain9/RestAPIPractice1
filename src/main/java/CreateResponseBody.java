
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateResponseBody {
    private String name;
    private String job;
    private String id;
    private String createdAt;
    public int statusCode;

}
