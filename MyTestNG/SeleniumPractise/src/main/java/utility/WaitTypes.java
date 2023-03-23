package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTypes {
    WebDriver driver;

    public WaitTypes(WebDriver driver){
        this.driver = driver;
    }

    public WebElement waitForElement(By locator, int timeout){
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
        }catch (Exception e){
            System.out.println("ÔªËØÈ±Ê§");
        }
        return element;
    }
}
