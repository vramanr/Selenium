package test.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithOKAndCancel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Venkat\\Software_Testing\\Selenium\\Automation_Projects\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();;
		WebElement alertwithokandcancel = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		alertwithokandcancel.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(60);
		driver.close();
	}

}
