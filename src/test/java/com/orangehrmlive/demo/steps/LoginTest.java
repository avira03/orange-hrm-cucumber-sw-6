package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginTest {
    @Given("I am on Login page")
    public void iAmOnLoginPage() {
    }

    @When("I am using valid credential")
    public void iAmUsingValidCredential() {
    }

    @And("Enter login username")
    public void enterLoginUsername() {
        new LoginPage().setEnterUserName("Admin");
    }

    @And("Enter login password")
    public void enterLoginPassword() {
        new LoginPage().setEnterPassword("admin123");
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("Click on User Profile logo")
    public void clickOnUserProfileLogo() {
        new HomePage().clickOnUserProfile();
    }

    @And("Mouse hover on Logout and click")
    public void mouseHoverOnLogoutAndClick() {
        new HomePage().clickOnLogoutButton();
    }

    @Then("Verify the text {string} is displayed")
    public void verifyTheTextIsDisplayed(String textMessage) {
        Assert.assertEquals(new HomePage().setVerifyLoginPanel(), textMessage, "LogonPanel not available");
    }

    @And("Enter username {string}")
    public void enterUsername(String username) {
        new LoginPage().setEnterUserName(username);
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        new LoginPage().setEnterPassword(password);
    }

    @Then("Verify Error message {string}")
    public void verifyErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().requiredMeassge(errorMessage),errorMessage,"Error not displayed");
    }
}
