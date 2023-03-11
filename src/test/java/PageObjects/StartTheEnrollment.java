package PageObjects;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartTheEnrollment {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[1]/label")
    private WebElement FirstName;

    public StartTheEnrollment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    }