package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecom {
	WebDriver driver;
	
	@Given("User Launch the Amazon")
	public void user_launch_the_amazon() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	    
	}

	@When("user open Url")
	public void user_open_url() {
		driver.get("https://www.amazon.com");
	   
	}

	@When("Search the mobile iphoneXR-Yellow")
	public void search_the_mobile_iphone_xr_yellow()
	{
	    	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("	iphone xr");
	}

	@Then("Select the matching Iphone once appear")
	public void select_the_matching_iphone_once_appear() {
	
	}

	@Then("Get the pric from selected iphone")
	public void get_the_pric_from_selected_iphone() {
	   
	}

}
