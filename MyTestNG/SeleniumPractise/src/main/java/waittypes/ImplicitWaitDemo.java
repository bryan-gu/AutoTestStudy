package waittypes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class ImplicitWaitDemo {
    private WebDriver driver;
    private String baseURrl;

    @BeforeClass
    public void setUp() {
        baseURrl = "www.baidu.com";
        System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        driver = new InternetExplorerDriver();

        driver.manage().window().maximize();
    }
    @Test
    public void test(){
        driver.get(baseURrl);
        driver.findElement(By.id("kw")).sendKeys("tests");

        //driver.findElement(By.id("su")).click();
    }
    @AfterClass
    public void cleanUp() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
