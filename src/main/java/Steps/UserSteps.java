package Steps;

import io.qameta.allure.Step;
import org.testng.Assert;

import static org.testng.Assert.*;

public class UserSteps {

    @Step
    public void checkDataSizeIsEqualToLimit(int limit, int data) {
        assertEquals(limit,data);
    }
}
