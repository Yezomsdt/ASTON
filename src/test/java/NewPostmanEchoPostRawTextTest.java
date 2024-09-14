import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class NewPostmanEchoPostRawTextTest {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    @Test
    public void testPostRequest() {
        String baseUrl = "https://postman-echo.com/post";

        String requestBody = "This is a raw text request body.";

        Response response = RestAssured.given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .when()
                .post(baseUrl);

        response.then().statusCode(200);

        String receivedText = response.jsonPath().getString("data");

        response.then()
                .body("data", equalTo(requestBody));

        System.out.println(ANSI_PURPLE + "Полученный текст: " + ANSI_RESET + receivedText);
    }
}
