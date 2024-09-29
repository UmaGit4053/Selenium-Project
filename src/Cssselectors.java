import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssselectors {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.print("tittle"+driver.getTitle());
        System.out.print("url"+driver.getCurrentUrl());
        Thread.sleep(200L);
        
        
        driver.findElement(By.cssSelector("#email")).sendKeys("anj@govreports.com.au");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Test@1234");
        driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
        Thread.sleep(2000L);
        driver.close();
	}

}
