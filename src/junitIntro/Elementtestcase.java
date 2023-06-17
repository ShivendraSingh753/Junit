package junitIntro;

import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementtestcase {
	
	
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://letskodeit.teachable.com/";
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
		System.out.println("Clicked on login");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		System.out.println("Sending keys to username field");
		driver.findElement(By.id("password")).sendKeys("test");
		System.out.println("Sending keys to password field");
		driver.findElement(By.id("email")).clear();
		System.out.println("Clearing the username field");
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
	}
}
