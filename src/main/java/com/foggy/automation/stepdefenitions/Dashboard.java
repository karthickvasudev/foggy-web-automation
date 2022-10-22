package com.foggy.automation.stepdefenitions;

import com.foggy.automation.coreframework.ApplicationCore;
import com.foggy.automation.coreframework.SeleniumHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    SeleniumHelper seleniumHelper;

    public Dashboard() {
        PageFactory.initElements(ApplicationCore.getDriver(), this);
        seleniumHelper = new SeleniumHelper(ApplicationCore.getDriver());
    }

    @FindBy(xpath = "//div[@id='content-wrapper']/h3")
    public WebElement dashboardHeader;

    @FindBy(xpath = "//button[@class='navbar-toggler']")
    public WebElement menuBar;
    @Then("I verify dashboard is displayed")
    public void iVerifyDashboardIsDisplayed() {
        boolean value = seleniumHelper.checkVisibility(dashboardHeader);
        Assert.assertEquals(true, value);
        String actual = dashboardHeader.getText();
        Assert.assertEquals("Dashboard", actual);
    }

    @Then("Open menu bar")
    public void openMenuBar() {
        seleniumHelper.click(menuBar);
    }

    @Then("I click {string} menu")
    public void iClickMenu(String menu) {
        WebElement element = seleniumHelper.findElement(By.xpath("//li/a[@class='nav-link' and text()='" + menu + "']"));
        element.click();
        seleniumHelper.addToDataMap("orderId",123);
    }


}
