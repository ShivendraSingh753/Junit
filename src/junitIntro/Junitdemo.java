package junitIntro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Junitdemo {
	
	WebDriver driver = null;
	WebDriver driver1 = null;

	@Before
	public void setUp() throws Exception {
		WebDriver driver;
		WebDriver driver1;
		
		
		
	}

	

	@Test
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://instagram.com");
        driver.quit();
       
		
	}
	
	
	
	@Test
	public void test2() {
		WebDriver driver1 = new EdgeDriver();
        driver1.manage().window().maximize();
		
		driver1.get("https://facebook.com");
	    driver1.switchTo().newWindow(WindowType.TAB);
	    driver1.get("https://amazon.com");
	    driver1.quit();
	   
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

}
