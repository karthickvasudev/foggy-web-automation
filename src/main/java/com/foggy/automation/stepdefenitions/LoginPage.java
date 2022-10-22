package com.foggy.automation.stepdefenitions;

import com.foggy.automation.coreframework.ApplicationCore;
import com.foggy.automation.coreframework.SeleniumHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    SeleniumHelper seleniumHelper;

    public LoginPage() {
        PageFactory.initElements(ApplicationCore.getDriver(), this);
        seleniumHelper = new SeleniumHelper(ApplicationCore.getDriver());
    }

    @FindBy(xpath = "//button[@data-bs-target='#loginModal']")
    public WebElement devLoginBtn;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='devId']")
    public WebElement devId;

    @FindBy(xpath = "//input[@id='devKey']")
    public WebElement devkey;
    @FindBy(xpath = "//div[@class='modal-footer']/button")
    public WebElement loginButton;


    @Given("Open the application")
    public void openLoginApplication() throws InterruptedException {
        seleniumHelper.navigateTo("https://foggywebdemo.web.app");
    }

    @Then("I login into the application")
    public void iLoginIntoTheApplication() {
        seleniumHelper.click(devLoginBtn);
        seleniumHelper.enterText(name,"Sajin");
        seleniumHelper.enterText(email,"sajin@gmail.com");
        seleniumHelper.enterText(devId,"108712567272799180515");
        seleniumHelper.enterText(devkey,"714d5571-01fd-4990-af6f-743a4c55a287");
        seleniumHelper.click(loginButton);
    }


}
