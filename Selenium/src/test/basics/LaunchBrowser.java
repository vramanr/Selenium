package test.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser
{
public static void main(String[] args) throws InterruptedException
{
	//System.setProperty("webdriver.chrome.driver","D:\\Venkat\\Software_Testing\\Selenium\\Automation_Projects\\Selenium\\Drivers\\chromedriver.exe");
	//WebDriver driver1 = new ChromeDriver();
	System.setProperty("webdriver.gecko.driver", "D:\\Venkat\\Software_Testing\\Selenium\\Automation_Projects\\Selenium\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://google.com");
	WebElement search= driver.findElement(By.xpath("//input[@name='q']"));
	search.isEnabled();
	search.sendKeys("Test entry");
	Thread.sleep(120);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	String currenturl= driver.getCurrentUrl();
	if (currenturl.equalsIgnoreCase("Google"));
	System.out.println("Testcase passed");
	driver.close();
}
}
