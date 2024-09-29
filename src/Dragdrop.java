import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/droppable/"); 
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        
        /* Method 1 - We find how many frames are there after that we directly put index values to switch that position                 
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")).getSize());
        */
        
        /* Method 2 - Its another way to switch frame to Iframe 
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
        */
        
        
        driver.findElement(By.id("draggable")).click();
        Actions a=new Actions(driver);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        
        a.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
        driver.close();        
      
        
        
        
        
        
        
        
        
	}

}
