package testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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
        baseURL = "https://www.baidu.com/";
        if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","D:\\My Documents\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","D:\\My Documents\\Downloads\\chromedriver_win32\\chromedriver.exe");
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
