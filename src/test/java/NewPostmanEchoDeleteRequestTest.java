import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class NewPostmanEchoDeleteRequestTest {

    @Test
    public void testDeleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com/delete";

        String requestBody = "This data will be deleted";

        Response response = given()
                .body(requestBody)
                .when()
                .delete();

        Assert.assertEquals(200, response.getStatusCode());

        String actualData = response.jsonPath().getString("data");

        Assert.assertEquals(requestBody, actualData);
    }
}
