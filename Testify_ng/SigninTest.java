package signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SigninTest {
    //import the selenium webDriver
    private WebDriver driver;
    // import chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty("webDriver.chrome.driver", "resources/chromeDriver.exe");
        driver = new ChromeDriver();
        //Input project URL = Postman URL
        driver.get("https://identity.getpostman.com/login?addAccount=1");
        //waiting for 5secs
        Thread.sleep(5000);
        //To maximize the browser page
        driver.manage().window().maximize();
        //To get the page title after complete loading
        System.out.println(driver.getTitle());
        //global wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("fomodion@gmail.com");
        driver.findElement(By.id("password")).sendKeys("bearwulf@2");
        driver.findElement(By.linkText("Sign In")).click();}
    public static void main(String[] args) throws InterruptedException{
        SigninTest test = new SigninTest();
        test.setUp();
    }

}


</project>
