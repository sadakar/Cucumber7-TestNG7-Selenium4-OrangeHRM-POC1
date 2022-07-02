@Directory
Feature: Dashboard page
  I want to use this template for my Directory Page

  Background: 
    Then User is on Directory page

  @DirectoryTabIsSearchButtonDisplayed
  Scenario: DirectoryTabIsSearchButtonDisplayed
    Then Is Search button displayed
