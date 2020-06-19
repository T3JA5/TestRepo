package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMTest {
	
	@Test
	public void run() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("1");
		driver.get("https://www.google.com/");
		System.out.println("2");
		Thread.sleep(10000);
		boolean search = driver.findElement(By.id("q")).isDisplayed();
		Assert.assertEquals(search, true);
		Thread.sleep(3000);
		System.out.println("3");
		driver.quit();
	}

}
