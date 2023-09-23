package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class loginStepdefinitons {

    loginPage login = new loginPage();
    Actions action = new Actions(Driver.getDriver());
    @Given(":user goes to the {string}")
    public void user_goes_to_the(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given(":user enters email address")
    public void user_enters_email_address() {
        login.username.sendKeys(ConfigReader.getProperty("username"));
    }
    @Given (":user enters password")
    public void user_enters_password() {
        login.password.sendKeys(ConfigReader.getProperty("password"));
    }
    @Given(":user clicks the login button")
    public void user_clicks_the_login_button(){
        login.loginButton.click();
        ReusableMethods.waitFor(2);

        }

    }


