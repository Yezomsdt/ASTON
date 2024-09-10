import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoDeleteRequestTest {

    @Test
    public void testDeleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com/delete";

        String requestBody = "This data will be deleted";

        Response response = given()
                .queryParam("data", requestBody)
                .when()
                .delete();

        Assert.assertEquals(200, response.getStatusCode());

        String expectedJson = "{\"data\":\"This data will be deleted\"}";
        String actualJson = response.asString();

        Assert.assertEquals(expectedJson, actualJson);
    }
}