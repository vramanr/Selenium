package test.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"D:\\Venkat\\Software_Testing\\Selenium\\Automation_Projects\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		ArrayList<String> originalList = new ArrayList<String>();

		for (int i = 0; i < firstColList.size(); i++)

		{

			originalList.add(firstColList.get(i).getText());

		}

		ArrayList<String> copiedList = new ArrayList<String>();

		for (int i = 0; i < originalList.size(); i++)

		{

			copiedList.add(originalList.get(i));

		}

//string

		Collections.sort(copiedList);

// Collections.reverse(copiedList);

		for (String s1 : originalList)

		{

			System.out.println(s1);

		}

		System.out.println("*******************");

		for (String s2 : copiedList)

		{

			System.out.println(s2);

		}

		Assert.assertTrue(originalList.equals(copiedList));

	}

}