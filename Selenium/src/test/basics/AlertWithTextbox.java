package test.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithTextbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Venkat\\Software_Testing\\Selenium\\Automation_Projects\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();;
		WebElement alertwithtextbox = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		alertwithtextbox.click();
		driver.switchTo().alert().sendKeys("Venkat");
		driver.switchTo().alert().accept();
		driver.close();

	}

}
