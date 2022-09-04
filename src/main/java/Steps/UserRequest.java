package Steps;

import io.restassured.response.Response;
import org.testng.Assert;

import java.awt.image.RescaleOp;

import static io.restassured.RestAssured.given;

public class UserRequest {

    public Response getUsers() {
        Response response;
        response = given()
                .header("Content-Type","application/json")
                .when()
                .get("https://gorest.co.in/public-api/users")
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
