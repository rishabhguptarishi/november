package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver = null;
	private static WebDriverWait waitDriver;

	private final static int TIMEOUT = 30;
	private final static int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver(String browserName) {
		// public static void setUp(String browserName) {
		System.out.println("Browser Name" + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		String window = driver.getWindowHandle();
		System.out.println("Window ->" + window);
	}

	public static void openPage(String url) {
		System.out.println(url);
		System.out.println(driver);
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver(String name) {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver(name);
		}
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			// driver.quit();
		}
		seleniumDriver = null;
	}

}
