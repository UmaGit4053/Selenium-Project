import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Project1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://corporate.spicejet.com/default.aspx"); 
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.println("tittle"+driver.getTitle());
        System.out.println("url"+driver.getCurrentUrl());
        Thread.sleep(2000L);
        
        /* click from field */
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        /* Select one value from drop down-> //Tag name[@name='value']*/
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='RDP']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GAU']")).click();
        //driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight.ui-state-active ui-state-hover")).click();
        driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //a[text()='15']")).click();
        
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        WebElement adult=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
        Select sd= new Select(adult);
        sd.selectByVisibleText("2");
        System.out.println(sd.getFirstSelectedOption().getText());
     // Assert.assertEquals(sd.getFirstSelectedOption().getText(),"2");
        
        String path="//input[@id='ctl00_mainContent_chk_IndArm']";
        Assert.assertFalse(driver.findElement(By.xpath(path)).isSelected());
        System.out.println(driver.findElement(By.xpath(path)).isSelected());
        driver.findElement(By.xpath(path)).click();
        Assert.assertTrue(driver.findElement(By.xpath(path)).isSelected());
        System.out.println(driver.findElement(By.xpath(path)).isSelected());
        Thread.sleep(2000L);
        
        /* click currency field*/ 
        driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
        WebElement currency=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));        
        Select sd1= new Select(currency);
        sd1.selectByVisibleText("CAD");
        /* Click Search */
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
        Thread.sleep(2000L);
        driver.close();

	}

}
