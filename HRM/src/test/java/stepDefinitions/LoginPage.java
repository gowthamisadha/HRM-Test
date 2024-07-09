package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public WebDriver driver;
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
						
	   	}

	@When("user open URL {string}")
	public void user_open_url(String url) {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get(url);
	    
	}

	@When("user enter username as {string} Password as {string}")
	public void user_enter_username_as_password_as(String username, String password){
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	    
	}

	@Then("Click on Login")
	public void click_on_login() {
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	    
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();    
	}


}
