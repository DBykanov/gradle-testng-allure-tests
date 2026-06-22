package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("User management")
@Feature("Auth")
public class SampleTest {

    @Test(description = "Successful login")
    @Description("Test verifies successful logging in with valid creds")
    public void successfulLoginTest() {
        stepOne("Entering login and passw");
        stepTwo("Clicking on Login");
        Assert.assertTrue(true, "User isn't authenticated");
    }

    @Test(description = "Login with invalid data")
    public void failedLoginTest() {
        stepOne("Entering invalid login and passw");
        stepTwo("Clicking on Login");

    }

    @Step("Step 1: {action}")
    private void stepOne(String action) {
        // Логика шага
    }

    @Step("Step 2: {action}")
    private void stepTwo(String action) {
        // Логика шага
        Assert.fail("Error was expected but user logged in anyway");
    }
}