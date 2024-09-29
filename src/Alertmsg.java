import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertmsg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.println("tittle"+driver.getTitle());
        System.out.println("url"+driver.getCurrentUrl());
        Thread.sleep(2000L);
        /*
        driver.findElement(By.id("name")).sendKeys("AnjaliShrath");
        Thread.sleep(2000L);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000L);
        driver.switchTo().alert().accept();
        */
        
        driver.findElement(By.id("name")).sendKeys("Uma Maheswari");
        Thread.sleep(2000L);
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000L);
    //  driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000l);
        driver.close();
        
        
        
        
        

	}

}
