package test.basics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountOfLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Venkat\\Software_Testing\\Selenium\\Automation_Projects\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int totallinkcount = allLinks.size();
		System.out.println(totallinkcount);
		WebElement footerdriver = driver.findElement(By.cssSelector("div#gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement discountcoupondriver = footerdriver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
		System.out.println(discountcoupondriver.findElements(By.tagName("a")).size());
		int display = discountcoupondriver.findElements(By.tagName("a")).size();
	for(int i=1;i < display;i++) {
		String Controlkey = Keys.chord(Keys.CONTROL,Keys.ENTER);
		discountcoupondriver.findElements(By.tagName("a")).get(i).sendKeys(Controlkey);
		Set<String> childwindow = driver.getWindowHandles();
		Iterator<String> it = childwindow.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
		
		driver.quit();
	}
}
