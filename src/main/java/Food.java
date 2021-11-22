import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Food {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver94.exe");
		//access the url case
		//ChromeOptions option = new ChromeOptions ();
	    //option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.eazydiner.com/");
        driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		
        WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id = 'webpush-onsite']")));

		WebElement ele = driver.findElement(By.xpath("//iframe[@id = 'webpush-onsite']"));

		driver.switchTo().frame(ele);

		driver.findElement(By.id("deny")).click();

		driver.switchTo().window(parent);
		
		
		WebElement we=driver.findElement(By.id("home-search"));
		we.click();
    	we.sendKeys("indraprastha");
    	Thread.sleep(2000);
    	we.submit();
     	driver.findElement(By.xpath("//button[@id='apxor_search']")).click();	
    	
    	}

}
