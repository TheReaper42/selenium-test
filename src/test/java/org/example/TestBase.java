package org.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.Main;
import page.TestOne;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;
    public static Main main;
    public static TestOne testOne;

    @BeforeClass
    public static void start() {
        System.setProperty("webdriver.chrome.driver", "WebDriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        main = PageFactory.initElements(driver, Main.class);
        testOne = PageFactory.initElements(driver, TestOne.class);
        main.goTo();
        main.clickButton();
    }

    @AfterClass
    public static void finish() {
        driver.quit();
    }
}
