package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginPage {
 public loginPage() {
    PageFactory.initElements(Driver.getDriver(), this);

}
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement username;

    @FindBy (xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy (xpath = "//div[@class='oxd-form-actions orangehrm-login-action']")
    public WebElement loginButton;

}
