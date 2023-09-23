package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import pages.recruitmentPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;

import static utilities.ReusableMethods.jsclick;


public class recruitmentStepdefinitions {
    Actions actions;
    Driver driver;
    recruitmentPage recruitmentPage = new recruitmentPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Then(":user clicks on recruitment")
    public void user_clicks_on_recruitment() {
        jsclick(recruitmentPage.recruitment);
    }
    @Given(":click on the add button")
    public void click_on_the_add_button() {
        jsclick(recruitmentPage.addButton);
    }
    @Given(":the save process is performed with valid values")
    public void the_save_process_is_performed_with_valid_values() {

     jsclick(recruitmentPage.firstNameText);
     recruitmentPage.firstNameText.sendKeys("Joe"+ Keys.ENTER);
     ReusableMethods.waitFor(1);
     jsclick(recruitmentPage.lastNameText);
     recruitmentPage.lastNameText.sendKeys("Brown"+ Keys.ENTER);
     ReusableMethods.waitFor(1);
     jsclick(recruitmentPage.selectButton);
     jsclick(recruitmentPage.select);
     jsclick(recruitmentPage.emailText);
     recruitmentPage.emailText.sendKeys("codermingledev@gmail.com"+Keys.ENTER);
     ReusableMethods.waitFor(1);
     jsclick(recruitmentPage.contactNumberText);
     recruitmentPage.contactNumberText.sendKeys("123456789"+Keys.ENTER);
     jsclick(recruitmentPage.saveButton);
     ReusableMethods.waitFor(5);

    }
    @Given(":search is clicked on the candidate page")
    public void search_is_clicked_on_the_candidate_page(){
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
       jsclick(recruitmentPage.candidateButton);
       jsclick(recruitmentPage.candidateNameText);
        recruitmentPage.candidateNameText.sendKeys("Joe Brown"+Keys.ENTER);
       jsclick(recruitmentPage.searchButton);
    }
    @Given(":candidate registration must be verified")
    public void candidate_registration_must_be_verified() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).perform();
        String expectedInformation = "Joe"+ "Brown"+ "codermingledev@gmail.com";
        String actualInformation = recruitmentPage.candidateNameText.getText();
        Assert.assertEquals(expectedInformation,actualInformation);
    }
    @Given(":a screenshot of the candidate page is taken")
    public void a_screenshot_of_the_candidate_page_is_taken() throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("assets/screenshots/screenshot.png");
        FileUtils.copyFile(sourceFile, destinationFile);
    }
    @And(":candidate page is closed")
    public void candidate_page_is_closed(){
        ReusableMethods.waitFor(5);
        Driver.quitDriver();

    }
}

