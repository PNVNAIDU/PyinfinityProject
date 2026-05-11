package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.WebElement;


public class HomePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\chromedriver.exe");

		driver.get("https://pynfinity.com/welcome/home");
		
		driver.switchTo().alert().dismiss();
		
		WebElement Ale= driver.findElement(By.xpath("//a[@role='button']"));
		Ale.click();

		
		
		WebElement drop= driver.findElement(By.xpath("//a[@role='button']"));
		drop.click();
		
		
		//span[@id='lrn'].click();

		//span[@id='ply'].click();

		//span[@id='exp'].click();


		//a[@id='lrn_b'].click();


		//a[@id='ply_b'].click();


		//a[@id='exp_b'].click();
		
		

	}

}
