import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
     //driver.get("https://www.facebook.com/");
        
        driver.get("https://login.salesforce.com");
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.print("tittle"+driver.getTitle());
        System.out.print("url"+driver.getCurrentUrl());
        Thread.sleep(2000L);
        
       // driver.findElement(By.cssSelector("input[name='email']")).sendKeys("anjali@gmail.com");
      //  driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Test@1234");
      //  driver.findElement(By.cssSelector("button[name='login']")).click();
      // Thread.sleep(2000L);
      //  driver.close();
        
        //driver.findElement(By.cssSelector("#username")).sendKeys("jack@outlook.com");
      //  driver.findElement(By.cssSelector("#password")).sendKeys("Test@1234");
      //  driver.findElement(By.cssSelector("#Login")).click();
      //  Thread.sleep(2000L);
      //  driver.quit();
 
        driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("anjali@govreports.com.au");
        driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.password")).sendKeys("Test1234");
        Thread.sleep(2000L);
        driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
        Thread.sleep(2000L);
        driver.close();
        
	}

}
