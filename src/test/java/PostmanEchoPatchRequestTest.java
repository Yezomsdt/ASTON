import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoPatchRequestTest {

    @Test
    public void testPatchRequest() {
        RestAssured.baseURI = "https://postman-echo.com/patch";

        String requestBody = "Updated value 4 PATCH request";

        Response response = given()
                .body(requestBody)
                .when()
                .patch();

        Assert.assertEquals(200, response.getStatusCode());

        String expectedJson = "{\"data\":\"Updated value 4 PATCH request\"}";
        String actualJson = response.asString();

        Assert.assertEquals(expectedJson, actualJson);
    }
}