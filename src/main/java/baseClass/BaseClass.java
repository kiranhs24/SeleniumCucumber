package baseClass;

import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Alerts;
import pages.Checkoboxes;
import pages.Dropdown;
import pages.MouseHover;
import pages.RadioButtons;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static JavascriptExecutor je;
	public static String scenarioName;
	public static Properties prop;
	public static Actions actions;
	
	public static RadioButtons radioButtons;
	public static Checkoboxes checkboxes;
	public static Alerts alerts;
	public static Dropdown dropdown;
	public static MouseHover mouseHover;

	public static WebDriver initBrowser(String browserrType, String url) {

		switch (browserrType) {

			case "Chrome":
				
				WebDriverManager.chromedriver().setup();
				
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--headless");
				chromeOptions.addArguments("--disable-gpu");
				chromeOptions.addArguments("--disable-extensions");
				chromeOptions.addArguments("--no-sandbox");
				chromeOptions.addArguments("--allow-insecure-localhost");
				
				driver = new ChromeDriver(chromeOptions);
				break;

			case "Firefox":
				
				WebDriverManager.firefoxdriver().setup();
				
				FirefoxOptions firefoxOption = new FirefoxOptions();
				firefoxOption.addArguments("--headless");
				firefoxOption.addArguments("--disable-gpu");
				firefoxOption.addArguments("--disable-extensions");
				firefoxOption.addArguments("--no-sandbox");
				firefoxOption.addArguments("--allow-insecure-localhost");
				
				driver = new FirefoxDriver(firefoxOption);
				break;
				
			case "Edge":
				
				WebDriverManager.edgedriver().setup();
				
				EdgeOptions edgeOptions = new EdgeOptions();
				edgeOptions.addArguments("--headless");
				edgeOptions.addArguments("--disable-gpu");
				edgeOptions.addArguments("--disable-extensions");
				edgeOptions.addArguments("--no-sandbox");
				edgeOptions.addArguments("--allow-insecure-localhost");
				
				driver = new EdgeDriver();
				break;
				
			default:
				break;

		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;

	}

}
