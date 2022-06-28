package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstScriptTest {
    public WebDriver driver;

    @Test
    public void SeleniumTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "WebDriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://localhost:8080");
        Thread.sleep(3000);
        WebElement login = driver.findElement(By.xpath("//button"));
        login.click();
        Thread.sleep(3000);
        WebElement keywords = driver.findElement(By.xpath("//*[text() = ' Keywords']"));
        WebElement parameters = driver.findElement(By.xpath("//*[text() = ' Parameters']"));
        WebElement grid = driver.findElement(By.xpath("//*[text() = ' Grid']"));
        String actualUrl =  "http://localhost:8080/#/root/plans/list";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("We are in Plans");


        keywords.click();
        Thread.sleep(1500);
        actualUrl = "http://localhost:8080/#/root/functions";
        expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("We are in Keywords");


        parameters.click();
        Thread.sleep(1500);
        actualUrl = "http://localhost:8080/#/root/parameters";
        expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("We are in Parameters");


        grid.click();
        Thread.sleep(1500);
        actualUrl = "http://localhost:8080/#/root/grid/agents";
        expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("We are in Grid");
        System.out.println("Success!");
        Thread.sleep(2000);
    }
}

