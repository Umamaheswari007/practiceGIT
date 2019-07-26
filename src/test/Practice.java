package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Uma\\Selenium\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

	}

}
