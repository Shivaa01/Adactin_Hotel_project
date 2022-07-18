package com.basclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browser) {				//1. BROWSER LAUNCH
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		} 
		else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Driver\\msedgedriver.exe");
			 driver = new EdgeDriver();
		}
		return driver;		
	}
	public static void close() {										//2. CLOSE
		driver.close();
	}
	public static void quit() {											//3. QUIT
		driver.quit();
	}
	public static void navigateTo(String url) {							//4.NAVIGATE TO
		driver.navigate().to(url);
	}
	public static void navigateBack() {									//5.NAVIGATE BACK
		driver.navigate().back();
	}
	public static void navigateFrwd(String url) {						//6.NAVIGATE FORWARD
		driver.navigate().forward();
	}
	public static void reFresh(String url) {							//7.NAVIGATE REFRESH
		driver.navigate().refresh();
	}
	public static void getUrl(String url) {								//8.GET	Launch URL
		driver.get(url);
	}
	public static void alertPop(String key) {							//9. ALERT
		switch (key.toLowerCase()) {
		case "accept":
			driver.switchTo().alert().accept();
			break;
		case "dismiss":
			driver.switchTo().alert().dismiss();
		default:
			break;
		}		
	}
	public static void mouseClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element);
	}
	public static void doubleClick(WebElement element) {				//10. ACTION
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}
	public static void rightClick(WebElement element) {	
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	public static void keyPress(String key) throws AWTException {		//12. ROBOT
		Robot rb = new Robot();
		switch (key.toLowerCase().replaceAll("\\s", "")) {
		case "up":
			rb.keyPress(KeyEvent.VK_UP); rb.keyRelease(KeyEvent.VK_UP); break;
		case "down":
			rb.keyPress(KeyEvent.VK_DOWN); rb.keyRelease(KeyEvent.VK_DOWN); break;
		case "pageup":
			rb.keyPress(KeyEvent.VK_PAGE_UP); rb.keyRelease(KeyEvent.VK_PAGE_UP); break;
		case "pagedown":
			rb.keyPress(KeyEvent.VK_PAGE_DOWN); rb.keyRelease(KeyEvent.VK_PAGE_DOWN); break;
		default:
			break;
		}
	}
	public static void windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println("Window Handles : "+title);
		}

	}
	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if(type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} else if(type.equalsIgnoreCase("byText")) {
			s.selectByVisibleText(value);
		}

	}
	public static void selectByIndex(WebElement element, int value) { 	//14. DROP DOWN
		Select s = new Select(element);
		s.selectByIndex(value);		
	}
	public static void selectByText(WebElement element, String value) { 
		Select s = new Select(element);
		s.selectByVisibleText(value);		
	}
	public static void selectByValue(WebElement element, String value) { 
		Select s = new Select(element);
		s.selectByValue(value);		
	}
	public static void checkBox(WebElement element) {					//15. CHECK BOX
		boolean selected = element.isSelected();
		if (selected==true) {
			element.click();
		}
		element.click();
	}
	public static boolean isEnabled(WebElement element) {				//16. IS ENABLED
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public static boolean isDisplayed(WebElement element) {				//17. IS DISPLAYED
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	public static boolean isSelected(WebElement element) {				//18. IS SELECTED
		boolean selected = element.isSelected();
		System.out.println("Is Selected : "+selected);
		return selected;
	}
	public static void getOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> opt = s.getOptions();
		for (WebElement webElement : opt) {
			String text = webElement.getText();
			System.out.println(text);
		}
//		int size = opt.size();
//		for (int i = 0; i < size; i++) {
//			String text = opt.get(i).getText();
//			System.out.println(text);
//		}
	}
	public static void inputKeys(WebElement element, String value) { 	//27. SEND KEYS
		boolean displayed = element.isDisplayed();
		if(displayed == true) {element.clear();}
		
		element.sendKeys(value);
	}
	
	public static void click(WebElement element) {						//31. CLICK
		element.click();	
	}
	public static void radioBtn(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}
	public static void openNewTab() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_CONTROL);
	}
	
}//terminal
