import Models.UserDataModel;
import Steps.UserRequest;
import Steps.UserSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class UsersTest {

    UserRequest userRequest = new UserRequest();
    UserSteps userSteps = new UserSteps();

    @Test
    @Epic("API")
    @Description("Users")
    public void publicApiUsersTest() {
        Response response = userRequest.getUsers();
        UserDataModel path = response.getBody().as(UserDataModel.class);

        int dataSize = path.getData().size();
        int limit = path.getMeta().getPagination().getLimit();

        userSteps
                .checkDataSizeIsEqualToLimit(limit,dataSize);

        for(int i = 0; i < dataSize; i++) {
            userSteps
                    .checkGender(path.getData().get(i).getGender())
                    .checkStatus(path.getData().get(i).getStatus())
                    .checkValueIsNotNull(path.getData().get(i).getId())
                    .checkValueIsNotNull(path.getData().get(i).getName())
                    .checkValueIsNotNull(path.getData().get(i).getEmail());
        }

    }


}
