package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class recruitmentPage {
    public recruitmentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Recruitment']")
    public WebElement recruitment;
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    public WebElement addButton;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstNameText;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastNameText;
    @FindBy(xpath = "//input[@placeholder='Type here'][1]")
    public WebElement emailText;
    @FindBy(xpath = "//input[@placeholder='Type here'][2]")
    public WebElement contactNumberText;
    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    public WebElement selectButton;
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    public WebElement select;
    @FindBy(xpath = "//button[@*='submit']")
    public WebElement saveButton;
    @FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab --visited']")
    public WebElement candidateButton;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement candidateNameText;
    @FindBy(xpath = " //button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement searchButton;
    @FindBy(xpath = "//div[@class='oxd-file-button']")
    public WebElement browseButton;

}
