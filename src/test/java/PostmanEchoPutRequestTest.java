import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoPutRequestTest {

    @Test
    public void testPutRequest() {
        RestAssured.baseURI = "https://postman-echo.com/put";

        String requestBody = "Wazzup, Postman Echo via PUT!";

        Response response = given()
                .body(requestBody)
                .when()
                .put();

        Assert.assertEquals(200, response.getStatusCode());

        String expectedJson = "{\"data\":\"Wazzup, Postman Echo via PUT!\"}";
        String actualJson = response.asString();

        Assert.assertEquals(expectedJson, actualJson);
    }
}