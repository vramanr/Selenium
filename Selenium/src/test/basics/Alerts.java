package test.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Venkat\\Software_Testing\\Selenium\\Automation_Projects\\Selenium\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement alerts = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alerts.click();
		driver.switchTo().alert().accept();
		driver.close();
		
	}

}
