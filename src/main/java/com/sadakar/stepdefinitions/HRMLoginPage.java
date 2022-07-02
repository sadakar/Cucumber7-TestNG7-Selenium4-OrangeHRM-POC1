package com.sadakar.stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sadakar.common.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMLoginPage extends BasePage {

	@Given("User is on login page")
	public static void homePage() throws InterruptedException {
	
		driver.quit();
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
	}

	@When("User enters username as {string} and password as {string}")
	public void enterUserNamePassword(String userName, String password) {

		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
	}

	@Then("User should be able to login successfully")
	public void clickSubmitLogin() {
		driver.findElement(By.id("btnLogin")).submit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
