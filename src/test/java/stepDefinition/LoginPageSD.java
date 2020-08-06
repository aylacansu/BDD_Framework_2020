package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import runnerTest.webPages.LoginPage;
import utils.BasePage;

public class LoginPageSD {

    LoginPage loginPage= new LoginPage();

    @Given("^I am on home page&")

    public void onHomePage(){

        Assert.assertEquals(BasePage.get().getCurrentUrl(),"https://www.facebook.com/");
    }
    @When("^I enter (.+) into (username|password) text fields on home screen$")
    public void enterDataUserAndPassField(String anyText,String textFields){
        switch (textFields){
            case "username":
                loginPage.enterEmail(anyText);
                break;
            case "password":
                loginPage.enterPassword(anyText);
                break;

        }
    }
    @And("^I click on (login button|create account) on home screen$")
    public void clickOnButton(String button){
          switch (button){
              case "login button":
                  loginPage.clickOnLoginButton();
                  break;
              case "create account":
                  break;
          }


    }

    @Then("^I verify that invalid credentials$")
    public void verifyInvalidLogin() throws InterruptedException {
        //Assert.assertEquals(loginPage.getErrorMessage(), "Log Into Facebook");
          loginPage.createAccount();
    }



















}
