import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver94.exe");
		
		
	   
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
			
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div[1]/a/div/div[1]/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='restaurants']/div[1]/div/div[3]/div[2]/div[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='eazy-booking']/div/div/div/div/ul/li[1]")).click();
		Thread.sleep(3000);
		//w.findElement(By.xpath("/html/body/div[20]/div/table/tbody/tr[5]/td[2]")).click();
		driver.findElement(By.xpath("//*[@id='eazy-booking']/div/div/div/div/ul/li[2]/select/option[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='slotForm']/div/div/button")).click();
		WebElement ww=driver.findElement(By.id("guest_name"));
		ww.click();
		ww.sendKeys("Samannay Majumder");
		driver.findElement(By.xpath("//*[@id='guest-form']/div/div[2]/div/div/input")).sendKeys("7406603601");
		driver.findElement(By.id("guest_email")).sendKeys("samjoymaj@.com");
		Thread.sleep(3000);
		driver.findElement(By.id("checkout-button")).click();
		
		
	}

}
