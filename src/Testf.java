import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testf {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium Testing\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000L);
        driver.manage().window().maximize();
        System.out.print("tittle"+driver.getTitle());
        System.out.print("url"+driver.getCurrentUrl());
        driver.get("https://www.instagram.com");
        Thread.sleep(200L);
        System.out.print("tittle"+driver.getTitle());
        System.out.print("url"+driver.getCurrentUrl());
        driver.navigate().back();
        Thread.sleep(2000L);
        System.out.print("tittle"+driver.getTitle());
        System.out.print("url"+driver.getCurrentUrl());
        driver.navigate().forward();
        Thread.sleep(2000L);
        System.out.print("tittle"+driver.getTitle());
        System.out.print("url"+driver.getCurrentUrl());
        driver.close();

	}

}
