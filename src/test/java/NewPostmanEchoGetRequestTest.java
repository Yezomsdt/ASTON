import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class NewPostmanEchoGetRequestTest {

    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com/get";

        Response response = RestAssured.given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get();

        response.then().statusCode(200);

        response.then()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));

        System.out.println(response.asString());
    }
}
