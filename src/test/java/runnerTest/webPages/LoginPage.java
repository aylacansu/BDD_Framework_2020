package runnerTest.webPages;

import org.openqa.selenium.By;

public class LoginPage  extends  ElementUtil{

    private By emailtextField=By.id("email");
    private By passwordTextField=By.id("pass");
    private By loginButton=By.id("u_0_b");
    private By getError=By.xpath("//div[contains(text(),'Log Into Facebook')]");
    private By createAccount = By.xpath("//a[contains(text(), 'Create New Account')]");

    public void enterEmail(String enterEmail){

        sendValue(emailtextField,enterEmail);

    }

    public void enterPassword(String enterPassword){

        sendValue(passwordTextField,enterPassword);

    }

    public void clickOnLoginButton(){

        clickOn(loginButton);

    }
//    public String getErrorMessage() throws InterruptedException {
//        Thread.sleep(5000);
//        return getTextFromElement(getError);
//    }

public boolean createAccount(){

        return isElementDisplayed(createAccount);
}







}
