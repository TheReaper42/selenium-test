package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitVisisbility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click (By elementBy) {
        waitVisisbility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void isElementDisplayed (By elementBy) {
        waitVisisbility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

}
