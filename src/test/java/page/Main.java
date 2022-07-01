package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage{
    String URL = "http://localhost:8080";
    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(URL);
    }

    public void choosePage(String keyword) {
        click(By.xpath("//*[text() = ' " + keyword + "']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickButton() {
        click(By.xpath("//button"));
    }
}
