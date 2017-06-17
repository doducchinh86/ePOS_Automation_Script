package AutomationTestWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoTestNG_Selenium {
	
	public WebDriver driver;
	String appUrl = "https://accounts.google.com";

	@Test
	public void f() {
		//if you didn't update the Path system variable to add the full directory path to the executable as above mentioned then doing this directly through code
		System.setProperty("webdriver.gecko.driver", "d://Applications//testing-neon2//geckodriver.exe");
		driver = new FirefoxDriver();
		//launch the firefox browser and open the application url
		driver.get("https://gmail.com");
		// maximize the browser window
		driver.manage().window().maximize();

		// declare and initialize the variable to store the expected title of
		// the webpage.
		String expectedTitle = "Gmail";
		// fetch the title of the web page and save it into a string variable
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		// enter a valid username in the email textbox
		WebElement username = driver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("TestSelenium");
		// enter a valid password in the password textbox
		WebElement password = driver.findElement(By.id("Passwd"));
		password.clear();
		password.sendKeys("password123");
		// click on the Sign in button
		WebElement SignInButton = driver.findElement(By.id("signIn"));

		SignInButton.click();

		// close the web browser

		driver.close();

	}
}
