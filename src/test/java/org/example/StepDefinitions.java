

package org.example;

import PageObjects.MainPage;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import java.util.List;

public class StepDefinitions {

    WebDriver driver;

    private MainPage mainPage;

    private List<WebElement> subscription;
    private List<WebElement> subscriptionFailed;
    private String xpath;

    public StepDefinitions() {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver(options);

        driver.manage().window().maximize();
        mainPage = new MainPage(driver);

    }

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        driver.get("C:\\Users\\Home\\Desktop\\lore\\Testing-Env\\index.html");
    }

    @When("I write the email address of {string}")
    public void i_write_the_email_address_of(String string) {
        mainPage.writeEmailToEmailField(string);
    }

    @When("I click the submit button")
    public void i_click_the_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    @When("I enter over the limits characters")
    public void i_enter_over_the_limits_characters() {
        mainPage.enterOverThelimitscharacters();
    }

    @When("I click on Read More Button")
    public void i_click_on_Read_More_Button() {
        Utils.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreButton();
    }

    @When("I click on Read More Virtual Page")
    public void i_click_on_Read_More_Virtual_Page() {
        Utils.scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreVirtualPage();
    }
    @When("I click on Read More Learn The Fundamentals")
    public void i_click_on_Read_More_Learn_The_Fundamentals(){
        Utils.scrollToElement(driver, mainPage.getFundamentalsHeader());
        mainPage.clickOnReadMoreLearnTheFundamentals();
    }


    @When("I click on Read More Learn Selenium")
    public void i_click_on_Read_More_Learn_Selenium(){
        Utils.scrollToElement(driver, mainPage.getFundamentalsHeader());
        mainPage.clickOnReadMoreLearnSelenium();

    @After
    public void cleanUp() {
        driver.quit();
    }
}













