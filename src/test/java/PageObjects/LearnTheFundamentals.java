package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnTheFundamentals {

        @FindBy(xpath ="file:///C:/Users/Home/Desktop/lore/Testing-Env/routes/fundamentals.html")
        private WebElement ReadMore;

        public LearnTheFundamentals(WebDriver driver) {PageFactory.initElements(driver, this);}

    }
