package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;


public class MainPage {

    public WebElement getLearn;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readMoreVirtual;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/h2")
    private WebElement fundamentalsHeader;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement readMoreInPerson;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/a")
    private WebElement readMoreFundamentals;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement readMoreButtonHybrid;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[2]/a")
    private WebElement QuestionsButton;

    @FindBy(xpath = "/html/body/section[6]/div/h2")
    private WebElement faqHeader;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[3]/a")
    private WebElement InstructorsButton;

    @FindBy(xpath = "/html/body/section[7]/div/h2")
    private WebElement readMoreOurInstructorsOnInstructors;
    private WebElement readMoreOurInstructors;

    @FindBy(xpath = "/html/body/section[5]/div/div/div[1]/a")
     private WebElement ReadMoreFundamentalspage;

    @FindBy(xpath = "/html/body/section[5]/div/div/div[1]/h2")
    private WebElement LearnSelenium;
    @FindBy(xpath = "/html/body/section[5]/div/div/div[1]/a")
    private WebElement readMoreLearnSelenium;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[1]/a")
    private WebElement whatYouWillLearnButton;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/h2")
    private WebElement learnTheFundamentalsHeader;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

    public void writeEmailToEmailField(String email) {
        this.emailField.sendKeys(email);
    }


    public void clickOnReadMoreButtonVirtual() {
        this.readMoreVirtual.click();
    }


    public WebElement getEmailField() {
        return this.emailField;
    }

    public WebElement getFundamentalsHeader() {
        return this.fundamentalsHeader;
    }
    public String getFundamentalsHeaderText() {
        return learnTheFundamentalsHeader.getText();
    }

    public void clickOnReadMoreFundamentals() {
        this.readMoreFundamentals.click();
    }


    public void clickOnReadMoreButtonInPerson() {
        this.readMoreInPerson.click();
    }


    public void enterOverTheLimitsCharacters() {
        this.emailField.sendKeys("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    public void clickOnReadMoreVirtualPage() {
        this.readMoreVirtual.click();
    }


    public void clickOnReadMoreButton() {
        this.readMoreButtonHybrid.click();
    }


    public void clickOnReadMoreLearnTheFundamentals() {
        this.readMoreFundamentals.click();
    }

    public void clickOnWhatYouWillLearn() {
        this.whatYouWillLearnButton.click();
    }

    public void clickOnReadMoreInPersonPage() {
        this.readMoreInPerson.click();
    }

    public void clickOnReadMoreQuestionsButton() {
        this.QuestionsButton.click();
    }

    public String getFaqHeader() {
        return faqHeader.getText();
    }
    public void clickOnReadMoreInstructorsButton() {
        this.InstructorsButton.click();
    }

     public void clickOnReadMoreOurInstructors() {
        this.readMoreOurInstructors.click();
    }

    public void clickOnQuestionsButton() {
        this.QuestionsButton.click();
    }

    public void clickOnInstructorsbutton() {
        this.InstructorsButton.click();
    }

    public void getOnInstructors() {
        this.readMoreOurInstructorsOnInstructors.click();

    }

    public void clickOnReadMoreFundamentalspage() {
        this.readMoreFundamentals.click();
    }

    public void clickOnReadMoreLearnSelenium() {
        this.readMoreLearnSelenium.click();
    }

    public WebElement getLearnSelenium() {
        return LearnSelenium;
    }
}

