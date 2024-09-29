import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uicalnder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://corporate.spicejet.com/default.aspx"); 
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.print("tittle"+driver.getTitle());
        System.out.print("url"+driver.getCurrentUrl());
        Thread.sleep(2000L);
        
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='RDP']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GAU']")).click();
        //Select Today Date
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
       // driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //a[text()='14']")).click();
      
        
        
        
        

	}

}
