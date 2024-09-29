import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Enabled_or_Disabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://corporate.spicejet.com/default.aspx"); 
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.println("tittle"+driver.getTitle());
        System.out.println("url"+driver.getCurrentUrl());
        Thread.sleep(2000L);
        
        /*Check that Return date is enabled or not*/
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.cssSelector("#Div1")).getAttribute("style"));
        
        /*RoundTrip ->Return Date is enabled or not */
        /* Click Round trip option*/
        driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
        /* check return date is enabled or not*/
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.cssSelector("#Div1")).getAttribute("style"));
        
        /*1 means enabled , 0.5 means also enabled not use for one trip option*/
        if(driver.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("1")) {
        	System.out.println("It is Enabled");
        	Assert.assertTrue(true);   	
        	
        }
        else {
        	System.out.println("Its is Disabled");
        	Assert.assertTrue(false);
        	
        }   
	}

}
