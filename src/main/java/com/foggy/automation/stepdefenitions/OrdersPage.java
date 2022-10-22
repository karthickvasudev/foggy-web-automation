package com.foggy.automation.stepdefenitions;

import com.foggy.automation.coreframework.ApplicationCore;
import com.foggy.automation.coreframework.SeleniumHelper;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {
    SeleniumHelper seleniumHelper;

    public OrdersPage() {
        PageFactory.initElements(ApplicationCore.getDriver(), this);
        seleniumHelper = new SeleniumHelper(ApplicationCore.getDriver());
    }

    @FindBy(xpath = "//div[@id='content-wrapper']/h2")
    public WebElement orderPageHeader;

    @Then("I verify order page is displayed")
    public void iVerifyOrderPageIsDisplayed() {
        String text = orderPageHeader.getText();
        Assert.assertEquals("Orders", text);
    }
}
