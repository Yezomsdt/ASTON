import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoPostRawTextTest {

    @Test
    public void testPostRequest() {
        RestAssured.baseURI = "https://postman-echo.com/post";

        String requestBody = "Wazzup, Postman Echo!";

        Response response = given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .when()
                .post();

        Assert.assertEquals(200, response.getStatusCode());

        String expectedJson = "{\"data\":\"Wazzup, Postman Echo!\"}";
        String actualJson = response.asString();

        Assert.assertEquals(expectedJson, actualJson);
    }
}