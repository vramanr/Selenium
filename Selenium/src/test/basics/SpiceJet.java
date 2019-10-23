package test.basics;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.ArrayList;

public class SpiceJet {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Venkat\\Software_Testing\\Selenium\\Automation_Projects\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Selecting FROM as Chennai
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		// Selecting TO as Trivandrum
		// driver.findElement(By.xpath("(//a[@value='TRV'])[2]")).click(); // by index
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='TRV']"))
				.click();
		// selecting depart date as current date
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		// selecting Passenger
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement adult = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select oselect = new Select(adult);
		oselect.selectByValue("5");
		WebElement Pass = driver.findElement(By.id("divpaxinfo"));
		Assert.assertEquals(Pass, "5 Adult");
		// Checkbox for Senior citizen
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		// Selecting Search
		// Print Number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
		// java.util.List<WebElement> checkboxes =
		// driver.findElements(By.cssSelector("[type='checkbox']"));
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
