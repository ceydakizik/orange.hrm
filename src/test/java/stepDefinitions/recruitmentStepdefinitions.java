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

       recruitmentPage.addButton.click();
    }
    @Given(":the save process is performed with valid values")
    public void the_save_process_is_performed_with_valid_values() {

     jsclick(recruitmentPage.firstNameText);
     recruitmentPage.firstNameText.sendKeys("Joe"+Keys.ENTER);
     jsclick(recruitmentPage.lastNameText);
     recruitmentPage.lastNameText.sendKeys("Brown"+ Keys.ENTER);
     jsclick(recruitmentPage.selectButton);
     jsclick(recruitmentPage.select);
     jsclick(recruitmentPage.emailText);
     recruitmentPage.emailText.sendKeys("codermingledev@gmail.com"+Keys.ENTER);
     ReusableMethods.waitFor(2);
     actions.sendKeys(Keys.PAGE_DOWN).perform();
     ReusableMethods.waitFor(1);
     recruitmentPage.saveButton.click();

    }
    @Given(":search is clicked on the candidate page")
    public void search_is_clicked_on_the_candidate_page(){
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        jsclick(recruitmentPage.candidateButton);
        jsclick(recruitmentPage.candidateNameText);
        recruitmentPage.candidateNameText.sendKeys("Joe Brown"+Keys.ENTER);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        jsclick(recruitmentPage.searchButton);
    }
    @Given(":candidate registration must be verified")
    public void candidate_registration_must_be_verified() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).perform();
        String expectedInformation = "Joe"+ "Brown"+ "codermingledev@gmail.com";
        String actualInformation = recruitmentPage.candidateNameText.getText();
        Assert.assertTrue(expectedInformation.contains(actualInformation));
    }
    @Given(":a screenshot of the candidate page is taken")
    public void a_screenshot_of_the_candidate_page_is_taken() throws IOException {
       TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("target/screenshots/pagescreenshot.png");
        FileUtils.copyFile(sourceFile, destinationFile);
        ReusableMethods.waitFor(5);

    }
    @And(":candidate page is closed")
    public void candidate_page_is_closed(){
        Driver.quitDriver();

    }
}

