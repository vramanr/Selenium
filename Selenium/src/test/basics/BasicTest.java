package test.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicTest {
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "D:\\Venkat\\Software_Testing\\Selenium\\Automation_Projects\\Selenium\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder =\"First Name\"]"));
		firstname.clear();
		firstname.sendKeys("Venkatraman");
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder =\"Last Name\"]"));
		lastname.clear();
		lastname.sendKeys("Rajaram");
		WebElement adress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		adress.clear();
		adress.sendKeys("Testaddress");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.clear();
		email.sendKeys("Testaddress");
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.clear();
		phone.sendKeys("9999999999");
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
		gender.click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		WebElement languages = driver.findElement(By.xpath("//a[contains(text(),'Arabic')]"));
		WebDriverWait wait = new  WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(languages));
		languages.click();
		WebElement hobbies = driver.findElement(By.xpath("//input[@value='Movies']"));
		hobbies.click();
		WebElement skills = driver.findElement(By.id("Skills"));
		 Select oselect= new Select(skills); 
		oselect.selectByIndex(1);
		WebElement country = driver.findElement(By.id("countries"));
		 Select oselect1= new Select(country); 
		oselect1.selectByVisibleText("India");
		WebElement date = driver.findElement(By.id("yearbox"));
		 Select oselect2= new Select(date); 
		oselect2.selectByValue("1983");
	}
}
