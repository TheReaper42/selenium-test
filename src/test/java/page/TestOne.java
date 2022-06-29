package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestOne extends BasePage{
    public TestOne(WebDriver driver) {
        super(driver);
    }

    public void checkPage(String keyword) {
        isElementDisplayed(By.xpath("//*[text() = '" + keyword + "']"));
    }
}
