import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.print("tittle"+driver.getTitle());
        System.out.print("url"+driver.getCurrentUrl());
        Thread.sleep(200L);
        /* Using Name Element */
       // driver.findElement(By.name("email")).sendKeys("anjali@govreports.com.au");
        /* Using ID Element */
       // driver.findElement(By.id("pass")).sendKeys("Test@1234");
        /* Using LinkText Element */
       // driver.findElement(By.linkText("Forgotten password?")).click();
        /* Using PartialLink Text Element */
      //  driver.findElement(By.partialLinkText("Forgotten")).click();
       // Thread.sleep(2000L);
       // driver.findElement(By.name("login")).click();	
      //  Thread.sleep(2000L);
        /* Using X path Element */
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("uma@govreports.com.au");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//*[@id=\"u_0_5_ED\"]")).click();
        Thread.sleep(2000L);
        driver.close();
        }
}
