package com.sadakar.stepdefinitions;

import org.openqa.selenium.By;

import com.sadakar.common.BasePage;

import io.cucumber.java.en.Then;

public class DirectoryPage extends BasePage{
	
	@Then("User is on Directory page")
	public void user_is_on_directory_page() {
		driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b")).click();
	}
	
	@Then("Is Search button displayed")
	public void isSearchButtonDisplayed() {
	
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).isDisplayed();
	}



}
