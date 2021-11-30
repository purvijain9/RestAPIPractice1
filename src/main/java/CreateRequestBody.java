
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateRequestBody{
    private String name;
    private String job;
}
