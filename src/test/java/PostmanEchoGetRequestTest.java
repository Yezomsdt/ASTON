import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoGetRequestTest {

    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com/get";

        Response response = given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get();

        Assert.assertEquals(200, response.getStatusCode());

        String expectedJson = "{\"args\":{\"foo1\":\"bar1\",\"foo2\":\"bar2\"},\"headers\":{},\"url\":\"https://postman-echo.com/get?foo1=bar1&foo2=bar2\"}";

        String actualJson = response.asString();

        Assert.assertEquals(expectedJson, actualJson);
    }
}