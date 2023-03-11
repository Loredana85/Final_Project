package PageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath ="/html/body/section[3]/div/div/div[1]/div/div/a" )
    private WebElement readMoreVirtual;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/h2")
    private WebElement fundamentalsHeader;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/a")
    private WebElement readMoreFundamentals;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

    public void writeEmailToEmailField(String email){
        this.emailField.sendKeys(email);
    }


    public void clickOnReadMoreButtonVirtual() {this.readMoreVirtual.click();}


    public WebElement getEmailField(){
        return this.emailField;

    }

    public WebElement getFundamentalsHeader() {
        return this.fundamentalsHeader;
    }

    public void clickOnReadMoreFundamentals() {
        this.readMoreFundamentals.click();
    }


    public void clickOnReadMoreLearnSelenium() {
         this.clickOnReadMoreLearnSelenium();
    }

    public void enterOverThelimitscharacters() {

    }

    public void clickOnReadMoreVirtualPage() {

    }


}
