package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserTest {
    @When("Login to Application")
    public void loginToApplication() {
    }

    @And("Enter login Username")
    public void enterLoginUsername() {
        new LoginPage().setEnterUserName("Admin");
    }

    @And("Enter login Password")
    public void enterLoginPassword() {
        new LoginPage().setEnterPassword("admin123");
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("Click On Admin")
    public void clickOnAdmin() {
        new AdminPage().clickOnAdminButton();

    }

    @And("Verify Text {string}")
    public void verifyTextSystemUsers(String errorMessage) {
        Assert.assertEquals(new ViewSystemUsersPage().setVerifyTextSystemUser(), errorMessage, "Messages is not displayed");
    }

    @And("Click On Add button")
    public void clickOnAddButton() {
        new AdminPage().clickOnAddButton();
    }

    @And("Verify Text for {string}")
    public void verifyTextForAddUser(String textMessage) {
        Assert.assertEquals(new AddUserPage().verifyAddUserText(), textMessage, "Message not displayed");

    }

    @And("Click on username dropdown")
    public void clickOnUsernameDropdown() {
        new AddUserPage().clickOnUserDropDown();
    }

    @And("Select User Role Admin")
    public void selectUserRoleAdmin() {
        new AddUserPage().setSelectUserRole();
    }

    @And("Enter Employee Name Peter Mac Anderson")
    public void enterEmployeeNamePeterMacAnderson() throws InterruptedException {
        Thread.sleep(3000);
        new AddUserPage().setEnterEmployeeName("Peter Mac Anderson");
        Thread.sleep(3000);
        new AddUserPage().setAutosuggestionlist();
    }

    @And("Enter Username")
    public void enterUsername() {
        new AddUserPage().enterTheUserName("krishajsk");
    }

    @And("Click on status drop down")
    public void clickOnStatusDropDown() {
        new AddUserPage().clickOnStatusDropDown();
    }

    @And("Select status Disable")
    public void selectStatusDisable() {
        new AddUserPage().selectDisable();
    }

    @And("Enter password")
    public void enterPassword() {
        new AddUserPage().enterPassword("Krisha13");
    }

    @And("Enter Confirm Password")
    public void enterConfirmPassword() {
        new AddUserPage().enterPassword("Krisha13");
    }

    @And("Click On Save Button")
    public void clickOnSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @Then("Verify message for success {string}")
    public void verifyMessageForSuccess(String textMessage) {
        Assert.assertEquals(new AddUserPage().verifyAddUserText(), textMessage, "Message not displayed");
    }

    @And("Enter Username to add user")
    public void enterUsernameToAddUser() {
        new ViewSystemUsersPage().setEnterUsername("Cassidy.Hope");
    }

    @And("Click on Search Button")
    public void clickOnSearchButton() {
        new ViewSystemUsersPage().setEnterSearch();
    }

    @And("Verify the User should be in Result list.")
    public void verifyTheUserShouldBeInResultList() {
        new ViewSystemUsersPage().setVerifyTheResult();
    }

    @And("Click on Check box")
    public void clickOnCheckBox() {
        new ViewSystemUsersPage().setTickOnCheckbox();
    }

    @And("Click on Delete Button")
    public void clickOnDeleteButton() {
        new ViewSystemUsersPage().setClickOnDeleteButton();
    }

    @And("Popup will display")
    public void popupWillDisplay() {
    }

    @And("Click on Ok Button on Popup")
    public void clickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnYesDeleteOption();

    }

    @Then("verify message {string}")
    public void verifyMessage(String message) {
        Assert.assertEquals(new ViewSystemUsersPage().getOneRecordFoundMessage(), message, "No record found");


    }

    @And("Enter Username {string}")
    public void enterUsername(String username) {
        new ViewSystemUsersPage().setEnterUsername(username);
    }

    @And("Select User Role {string}")
    public void selectUserRole(String userrole) {
        new ViewSystemUsersPage().selectUserRole(userrole);
    }

    @And("Select Status {string}")
    public void selectStatus(String Status) {
        new ViewSystemUsersPage().clickOnStatusDropDownInSystemUsers(Status);
    }

    @Then("Click on Reset Tab")
    public void clickOnResetTab() {
        new ViewSystemUsersPage().clickOnResetButtonInSystemUsers();
    }
}
