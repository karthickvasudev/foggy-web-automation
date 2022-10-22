package com.foggy.automation.coreframework;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationCore {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Before
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void after() {
        getDriver().quit();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}
