# Automated Testing for eBay Product Access

## Overview

This project demonstrates automated testing for two scenarios on eBay using Selenium WebDriver with Java and TestNG. 

##The scenarios are as follows:

#1. **Scenario 1: Access a Product via category after applying multiple filters**
   - Navigate to eBay.com
   - Navigate to "Electronics > Cell Phones & accessories"
   - Click on "Cell Phones & Smartphones" in the left-hand side navigation
   - Click on "All Filters" and add 3 filters - Condition, Price, and Item location
   - Verify that the filter tags are applied

#2. **Scenario 2: Access a Product via Search**
   - Navigate to eBay.com
   - Type a search string in the search bar (e.g., MacBook)
   - Change the search category to "Computers/Tablets & Networking" and click Search
   - Verify that the page loads completely
   - Verify that the first result name matches the search string

## Project Structure

The project is structured with clear naming conventions for classes and methods:

- **`tests` package:** Contains TestNG test classes for each scenario.
- **`pages` package:** Contains Page Object classes representing different pages on eBay.
- **`utils` package:** Contains utility classes for common actions, such as interacting with web elements.
- **'Base'  package:** Contains base class(base.java)deals with all the common functions used by all the pages.

## Setting Up and Running the Code

### Prerequisites

- JDK (Java Development Kit) installed
- Maven installed Build and package management
- Selenium Libraries
- TestNG Test execution and Reporting
- Extent Report

### Steps

1. Clone the repository to your local machine.

   ```bash
   git clone https://github.com/rahulvthorat/EbayAutomationTest.git



### Process
   It should be an automation process in Selenium with Hybrid framework. 
   

### Introduction
It is a Selenium automation project written in Java to perform web testing.

### Test Automation with Java
Web test automation example project using Eclipse IDEA Community, Java, Maven, TestNG, Selenium 4, and Page Object Model (POM).

### Test Subject
I've picked ebay.com as a test subject for no particular reason. 
It's is a large site and does have variety of features that we can play around with.


### Installation and RUN
 * How to import java project in eclipse from github. [ https://www.youtube.com/watch?v=_BkWCIcvNBs&t=14s ]
 * To import a GitHub project into Eclipse, you can follow these steps:
 * Open Eclipse and just on rightclick.
 * Select "Import" from the dropdown menu. This will open the Import wizard.
 * In the Import wizard, expand the "Git" folder and select "Projects from Git". Click "Next".
 * Choose the "Clone URI" option and click "Next".
 * Copy the repository's Git clone URL from GitHub. [ https://github.com/rahulvthorat/]
 * Paste the URL into the "URI" field in the Import wizard.
 * Click "Next" and Eclipse will automatically fill in the remaining fields based on the URL.
 * Select the branches you want to import and click "Next".
 * Choose the directory where you want to store the repository on your local machine.
 * Select a project wizard to use for importing the project. For example, if it's a Java project, choose "Maven Project". Click "Next".
 * Customize the project settings if necessary and click "Finish". Eclipse will clone the repository and import it as a project.
 * Once the import process is complete, the project should appear in the Package Explorer or Project Explorer view in Eclipse.
 
### Note 
 * Update project and Make sure you have the required plugins or dependencies installed in Eclipse to work with the specific project type. For example, if you're importing a Maven project, ensure you have the Maven plugin installed in Eclipse.
 * By following these steps, you should be able to successfully import a GitHub project into Eclipse.