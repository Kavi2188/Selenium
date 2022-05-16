package com.day1_browserlaunch;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Base_Class {
		//Method 1 (Launch)
		
		 public static WebDriver driver;
		public static WebDriver browserLaunch(String browsername) {

			try {
				if (browsername.equalsIgnoreCase("Chrome")) {
					
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
					 driver= new ChromeDriver();
	} 
				else if (browsername.equalsIgnoreCase("gecko"))
				{
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+("\\Selenium\\Driver\\geckodriver.exe"));
				 driver = new FirefoxDriver();
	}	
				else {
					System.out.println("Invalid BrowserName");
				}
				driver.manage().window().maximize();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			return driver;
			}
		
		//Method 2 (SendKeys)
		public static void sendKeys(WebElement element, String value) 
		{
			try {
				element.sendKeys(value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
//Method 3 (get)
	public static void get(String value) {
		try {
			driver.get(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
//Method 4(Click)	
	public static void click(WebElement element) {
try {
	element.click();
} catch (Exception e) {
	e.printStackTrace();
}		
	}
	//Method 5 (Forward)
	public static void forward() {
		driver.navigate().forward();
	}
//Method (back)
public static void back() {
	try {
		driver.navigate().back();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
//Method (navigate to) 
public static void navigate(String value) {
	driver.navigate().to(value);
}


	}


