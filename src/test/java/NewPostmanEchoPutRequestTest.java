import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class NewPostmanEchoPutRequestTest {

    @Test
    public void testPutRequest() {
        String baseUrl = "https://postman-echo.com/put";

        String requestBody = "{ \"foo1\": \"bar1\", \"foo2\": \"bar2\" }";

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put(baseUrl);

        response.then().statusCode(200);

        String foo1Response = response.jsonPath().getString("json.foo1");
        String foo2Response = response.jsonPath().getString("json.foo2");

        response.then()
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"));

        System.out.println("foo1: " + foo1Response);
        System.out.println("foo2: " + foo2Response);
    }
}
