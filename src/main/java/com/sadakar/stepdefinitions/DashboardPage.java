package com.sadakar.stepdefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.sadakar.common.BasePage;

import io.cucumber.java.en.Then;

public class DashboardPage extends BasePage {

	@Then("User finds the list of quick launch elements")
	public void listOfQuickLaunchElementsOnDashboardPage() {

		// Adding table data of a row to WebElement List
		List<WebElement> actualListOfQuickLaunchElements = driver
				.findElements(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td"));

		// Display the table data of row from the WebElementList
		for (WebElement ele : actualListOfQuickLaunchElements) {
			System.out.println(ele.getText());
		}

		// Display the size of WebElement List
		System.out.println("Size of Quick launch elements : " + actualListOfQuickLaunchElements.size());

		// Adding WebElements List to a ArrayList
		List<String> quickLaunchElementsArrayList = new ArrayList<String>();
		for (WebElement ele : actualListOfQuickLaunchElements) {
			quickLaunchElementsArrayList.add(ele.getText());
		}
		// Displaying the WebElements from the ArrayList
		for (WebElement s : actualListOfQuickLaunchElements) {
			System.out.println(s.getText());
		}
		// Size of the ArrayList
		System.out.println("Size of Array list : " + quickLaunchElementsArrayList.size());

		// Preparing expected list of elements

		@SuppressWarnings("serial")
		List<String> expecteListOfQuickLaunchElements = new ArrayList<String>() {
			{
				add("Assign Leave");
				add("Leave List");
				add("Timesheets");
				add("Apply Leave");
				add("My Leave");
				add("My Timesheet");
			}
		};

		// comparing actual list with expected list
		for (int i = 0; i < actualListOfQuickLaunchElements.size(); i++) {
			String actualLabels = actualListOfQuickLaunchElements.get(i).getText();
			String expectedLabels = expecteListOfQuickLaunchElements.get(i);
			Assert.assertEquals(actualLabels, expectedLabels);
		}

	}

	@Then("User clicks on Directory tab and verifies the navigation")
	public void navigateToDirectoryTabFromDashbaordTab() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]")).click();
	}

}
