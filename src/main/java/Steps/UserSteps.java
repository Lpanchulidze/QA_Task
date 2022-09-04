package Steps;

import io.qameta.allure.Step;
import org.testng.Assert;

import static org.testng.Assert.*;

public class UserSteps {

    @Step
    public void checkDataSizeIsEqualToLimit(int limit, int data) {
        assertEquals(limit,data);
    }

    @Step
    public UserSteps checkGender(String gender) {
        if(!(gender.equals("male") || gender.equals("female"))) {
            Assert.fail("gender value missmatch: " + gender);
        }

        return this;
    }

    @Step
    public UserSteps checkStatus(String status) {
        if(!(status.equals("active") || status.equals("inactive"))) {
            Assert.fail("unexpected status: " + status);
        }

        return this;
    }

    @Step
    public UserSteps checkValueIsNotNull(Object value) {
        assertNotNull(value);

        return this;
    }




}
