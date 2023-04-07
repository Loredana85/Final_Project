

package org.example;

import PageObjects.MainPage;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;



import static org.example.Utils.*;

public class StepDefinitions {

    WebDriver driver;

    private MainPage mainPage;

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
        mainPage.enterOverTheLimitsCharacters();
    }

    @When("I click on Read More Button for Hybrid")
    public void i_click_on_Read_More_Button() {
        scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreButton();
    }

    @When("I click on Read More Virtual Page")
    public void i_click_on_Read_More_Virtual_Page() {
        scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreVirtualPage();
    }
    @When("I click on Read More In Person Page")
    public void i_click_on_Read_More_In_Person_Page() {
        scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreInPersonPage();
    }


    @When("I click on Read More Learn The Fundamentals")
    public void i_click_on_Read_More_Learn_The_Fundamentals(){
        scrollToElement(driver, mainPage.getFundamentalsHeader());
        mainPage.clickOnReadMoreLearnTheFundamentals();
    }

    @When("I click the Questions button")
    public void i_click_the_Questions_button() {mainPage.clickOnQuestionsButton();}
    @Then("the page goes down to the FAQ sections")
    public void the_page_goes_down_to_the_FAQ_sections(){
        waitForElementToLoad(5);
        Assert.assertEquals(mainPage.getFaqHeader(),"Frequently Asked Questions");
    }
    @When("I click the Instructors button")
    public void i_click_the_Instructors_button() {mainPage.clickOnInstructorsbutton();}
    @Then("the page goes down to the Our Instructors")
    public void the_page_goes_down_to_the_Our_Instructors(){
        scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreOurInstructors();
    }
    @Then("the Learn Selenium loads return")
    public void the_Learn_Selenium_loads_return(){
        scrollToElement(driver, mainPage.getEmailField());
        mainPage.clickOnReadMoreFundamentalspage();
    }


    @When("the {string} page loads")
    public void the_page_loads(String string) {
        Assert.assertEquals(driver.getTitle(), string);
    }

    @Then("a success pop-up appears")
    public void a_success_pop_up_appears() {
        driver.switchTo().alert().accept();
    }

    @When("I click on Read More Fundamentals page")
    public void i_click_on_Read_More_Fundamentals_page() {
        scrollToElement(driver, mainPage.getFundamentalsHeader());
        mainPage.clickOnReadMoreFundamentalspage();
    }

    @Then("the {string} loads return")
    public void theLoadsReturn(String arg0) {

    }

    @After
    public void cleanUp() {
        driver.quit();
    }

    @When("I click on Read More Learn Selenium")
    public void i_click_on_Read_More_Learn_Selenium() {
        scrollToElement(driver, mainPage.getLearnSelenium());
        mainPage.clickOnReadMoreLearnSelenium();
    }


    @When("I click the What You'll Learn button")
    public void i_click_the_WhatYouLl_Learn_Button() {
        mainPage.clickOnWhatYouWillLearn();

    }

    @Then("the page goes down to the Learn The Fundamentals")
    public void thePageGoesDownToTheLearnTheFundamentals() {
        Assert.assertEquals(mainPage.getFundamentalsHeaderText(), "Learn The Fundamentals");
    }
}


















