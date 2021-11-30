
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class CreateUserClient {
    public CreateResponseBody createUser(CreateRequestBody requestBody)
    {
        Response response=given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post("https://reqres.in/api/users");
        System.out.println("Response Body is successfully created with these attributes "+response.asString());


        CreateResponseBody responseBody= response.as(CreateResponseBody.class);

        int status=response.statusCode();
        responseBody.setStatusCode(status);
        return responseBody;
    }
}

