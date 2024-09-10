import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoPostFormDataTest {

    @Test
    public void testPostFormDataRequest() {
        RestAssured.baseURI = "https://postman-echo.com/post";

        String key1 = "value1";
        String key2 = "value2";

        Response response = given()
                .formParam("key1", key1)
                .formParam("key2", key2)
                .when()
                .post();

        Assert.assertEquals(200, response.getStatusCode());

        String expectedJson = "{\"form\":{\"key1\":\"value1\",\"key2\":\"value2\"}}";
        String actualJson = response.asString();

        Assert.assertEquals(expectedJson, actualJson);
    }
}