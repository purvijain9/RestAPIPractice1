
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class RestAPITests {

    @Test
    public void getTheRequest(){
        Response response= given().get("https://reqres.in/api/users/2");
        String responseBody=response.asString();
        System.out.println("Response Body is " +responseBody);

        int statusCode=response.statusCode();
        System.out.println("Status Code is "+statusCode);
        Assert.assertEquals(statusCode,200);
    }

    @Test
    public void postTheRequest(){
        CreateRequestBody requestBody = CreateRequestBody.builder().name("Priya").job("Doctor").build();

        CreateResponseBody responseBody = new CreateUserClient().createUser(requestBody);

        Assert.assertNotNull(responseBody.getId());

        Assert.assertEquals(responseBody.getName(),"Priya");

        Assert.assertEquals(responseBody.getJob(),"Doctor");

        Assert.assertEquals(responseBody.statusCode,201);

    }
}

