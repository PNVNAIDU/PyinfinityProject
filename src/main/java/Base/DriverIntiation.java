package Base;

import java.sql.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DriverIntiation {

	public static void main(String[] args) throws InterruptedException {
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\chromedriver.exe");
		
 


		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
//		WebElement element = driver.findElement(By.xpath("//button[@class='btn btn-outline-info mt-2 mb-2 float-end']"));
//	
//		Thread.sleep(6000);
//		
//		driver.switchTo().alert().accept();
//		
//		element.click();
//		
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
		//WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
		//driver.switchTo().frame(By.)
		
		
		
		
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	        WebElement element = wait.until(
//	                ExpectedConditions.visibilityOfElementLocated(By.id("username"))
//	        );
//		
		
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		
		
		
		
//Waits 
		
		
//       WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(null)));
//		
//		
//		WebElement ele1 = wait.until(ExpectedConditions.elementToBeClickable(By.id(null)));
//		
//		WebElement ele2 = wait.until(ExpectedConditions.elementToBeVisiable(By.id(null)));
//		
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(null)));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

		//wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));

		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loader")));

		//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("msg"), "Success"));

		//wait.until(ExpectedConditions.alertIsPresent());

		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frameName"));

		//wait.until(ExpectedConditions.titleContains("Dashboard"));
		
		
//Frames
		
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(By.xpath("//a[text()='Selenium Practice']")).build().perform();
		
		
		
		
		driver.switchTo().frame("[Frame1");//By name
		
		
		
		//driver.switchTo().frame("frameName");//By index
		
		
	
		//driver.switchTo().frame("frameName");// frameElemet
		
		
		
		//screen shot 
		
		takes
		
		
		

	}

}
