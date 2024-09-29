import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assertionprg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
       // driver.get("https://corporate.spicejet.com/default.aspx"); 
       // Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.print("tittle"+driver.getTitle());
        System.out.print("url"+driver.getCurrentUrl());
        Thread.sleep(2000L);
        
        
      //Assertion program code //
        // Need to configure testing jar file
        
        String path="//input[@id='ctl00_mainContent_chk_IndArm']";
        driver.get("https://corporate.spicejet.com/default.aspx");
        //check condition if the check box is selected=false
        Assert.assertFalse(driver.findElement(By.xpath(path)).isSelected());
        // if the check box is not selected then select that
        System.out.println(driver.findElement(By.xpath(path)).isSelected());
        driver.findElement(By.xpath(path)).click();
        Assert.assertTrue(driver.findElement(By.xpath(path)).isSelected());
        System.out.println(driver.findElement(By.xpath(path)).isSelected());
        Thread.sleep(2000L);
        //click adult drop down
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        //create object for that
        WebElement adult=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
        Select sd=new Select(adult);
        sd.selectByVisibleText("5");
        System.out.println(sd.getFirstSelectedOption().getText());
        Assert.assertEquals(sd.getFirstSelectedOption().getText(),"4");
        
        
        
        
        
        
        
        
        
        
        
        
        

	}

}
