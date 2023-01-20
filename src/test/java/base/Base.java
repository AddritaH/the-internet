package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Base {
public static WebDriver driver;
	
	public static void navigateURL(String url) {
		driver.get(url);
	}
	
	public static void sendKeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}
	
	public static void click(By by) {
		driver.findElement(by).click();
	}
	
	public static void enter(By by) {
		driver.findElement(by).sendKeys(Keys.RETURN);
	}
	
	public static void select(By by) {
		driver.findElement(by).isSelected();
	}
	
	public static void clear(By by) {
		driver.findElement(by).clear();
	}
	
	public static String getText(By by) {
		String text = driver.findElement(by).getText();
		return text;
	}
	
	public static String getAttribute(By by, String a) {
		String text = driver.findElement(by).getAttribute(a);
		return text;
	}
	
	public static boolean isDisplayed(By by) {
		boolean logo = driver.findElement(by).isDisplayed();
		return logo;
	}


}

	


