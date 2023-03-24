package waittypes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.WaitTypes;

import java.time.Duration;

public class ExplicitWaitDemo {
    private WebDriver driver;
    private String baseURrl;

    private WaitTypes wt;

    @BeforeClass
    public void setUp() {
        baseURrl = "https://www.baidu.com/";
        System.setProperty("webdriver.edge.driver","D:\\JavaStudy\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();

        wt = new WaitTypes(driver);

    }
    @Test
    public void test(){
        driver.get(baseURrl);
        WebElement searchTest = driver.findElement(By.id("kw"));
        searchTest.sendKeys("tests");
        driver.findElement(By.id("su")).click();
        wt.waitForElement(By.xpath("//*[contains(text(),\"百度百科\")and contains(text(),\"test\")]"),3).click();

        //driver.findElement(By.xpath("//*[@id=\"3\"]/div/div/h3/a")).click();//未使用显示等待，页面元素未加载，无法找到元素
/*
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"3\"]/div/div/h3/a"))).click();
*/

    }
    @AfterClass
    public void cleanUp() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
