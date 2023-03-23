package testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNG_SeleniumParametersParallelExample {
    WebDriver driver;
    String baseURL;


    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String browser){
        baseURL = "www.baidu.com";
        if (browser.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver","C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            driver = new ChromeDriver();
        }
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseURL);
    }
    @Test
    public void testLogin(){

        WebElement searchText = driver.findElement(By.xpath("//*[@id=\"kw\"]"));
        searchText.sendKeys("java");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"su\"]"));
        searchButton.click();
    }
    @AfterClass
    public void cleanUP(){
        driver.quit();
    }
}
