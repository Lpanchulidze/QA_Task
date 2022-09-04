package Steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.Assert;

import java.awt.image.RescaleOp;

import static Utils.Constant.UsersUrl;
import static io.restassured.RestAssured.given;

public class UserRequest {

    @Step
    public Response getUsers() {
        Response response;
        response = given()
                .header("Content-Type","application/json")
                .when()
                .get(UsersUrl)
                .then()
                .and().extract().response();
        int statusCode = response.statusCode();
        if(statusCode == 200) {
            return response;
        } else {
            Assert.fail("Response Status Code: " + statusCode);
        }

        return null;
    }


}
