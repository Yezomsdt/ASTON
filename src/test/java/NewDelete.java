import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.junit5.AllureJunit5;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static io.restassured.RestAssured.given;

@ExtendWith(AllureJunit5.class)
public class NewDelete {

    @Test
    @Description("Тест отправки DELETE запроса на Postman Echo")
    @Severity(SeverityLevel.CRITICAL)
    public void testDeleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com/delete";

        String requestBody = "This data will be deleted";

        Response response = sendDeleteRequest(requestBody);

        verifyResponseStatus(response);
        verifyResponseBody(requestBody, response);
    }

    @Step("Отправка DELETE запроса")
    private Response sendDeleteRequest(String requestBody) {
        return given()
                .body(requestBody)
                .when()
                .delete();
    }

    @Step("Проверка статуса ответа")
    private void verifyResponseStatus(Response response) {
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Step("Сравнение тела запроса и ответа")
    private void verifyResponseBody(String expectedData, Response response) {
        String actualData = response.jsonPath().getString("data");
        Assert.assertEquals(expectedData, actualData);
    }
}