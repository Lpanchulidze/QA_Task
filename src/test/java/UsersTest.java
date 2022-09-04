import Models.UserDataModel;
import Steps.UserRequest;
import Steps.UserSteps;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.awt.image.RescaleOp;

public class UsersTest {

    UserRequest userRequest = new UserRequest();
    UserSteps userSteps = new UserSteps();

    @Test
    public void publicApiUsersTest() {
        Response response = userRequest.getUsers();
        UserDataModel path = response.getBody().as(UserDataModel.class);

        int dataSize = path.getData().size();
        int limit = path.getMeta().getPagination().getLimit();
        userSteps
                .checkDataSizeIsEqualToLimit(limit,dataSize);



    }


}
