package waittypes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
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
        baseURrl = "https://www.baidu.com/";
        System.setProperty("webdriver.edge.driver","D:\\My Documents\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();

    }
    @Test
    public void test(){
        driver.get(baseURrl);
        driver.findElement(By.id("kw")).sendKeys("tests");

        driver.findElement(By.id("su")).click();
    }
    @AfterClass
    public void cleanUp() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
