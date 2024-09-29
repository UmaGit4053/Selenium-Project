import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        
        
        
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();      
        driver.findElement(By.xpath("oxd-main-menu-item")).click();
        
        
      driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).click();
      driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("anjali@govreports.com.au");
        

	}

}
