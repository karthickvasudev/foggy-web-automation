package com.foggy.automation.coreframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class SeleniumHelper {
    public static Map<String, Object> dataMap;
    WebDriver driver;

    public SeleniumHelper(WebDriver webDriver) {
        driver = webDriver;
        if (dataMap == null) {
            dataMap = new HashMap<>();
        }
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void click(By by) {
        driver.findElement(by);
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public void enterText(WebElement element, String str) {
        element.sendKeys(str);
    }

    public boolean checkVisibility(WebElement element) {
        return element.isDisplayed();
    }

    public void addToDataMap(String key, Object value) {
        dataMap.put(key,value);
    }

    public Object getFromDataMap(String key) {
        return dataMap.get(key);
    }
}
