import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/"); 
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        
        /* Create Object for Actions Class*/      
        Actions a=new Actions(driver);
        /* Create Variable for action path */      
        WebElement move = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
        a.moveToElement(move).build().perform();
        Thread.sleep(2000L);
        
        /* Create Variable for Search path */
        WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        /* Need to click search so use click*/
        /* Need to type capital letter so we use shift from keyboard that time we use Shift*/
        /* Right Arrow ->Shift*/
        a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("vivo mobile").build().perform();
        Thread.sleep(2000L);
        
        /* context click ->user right click option*/        
        a.moveToElement(move).contextClick().build().perform();
        
        
     
	}

}
