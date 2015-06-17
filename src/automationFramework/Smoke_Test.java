package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LogIn_Page;
import pageObjects.Dashboard_Page;
import pageObjects.NewPage_Page;
import pageObjects.PDHome_Page;

public class Smoke_Test {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		 driver = new FirefoxDriver();
		 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     driver.get("https://kenneth.atlassian.net/login");
//====================================== Test Setup ===================================================================
// UseLogiIn_Page Object to login
	     
	     LogIn_Page.txtbx_UserName(driver).sendKeys("kenneth.qa@gmail.com");
	 
	     LogIn_Page.txtbx_Password(driver).sendKeys("Jira@10pm");
	 
	     LogIn_Page.btn_LogIn(driver).click();
	 
	     System.out.println(" Login Successfully, now it is the time to run some tests.");

//==========================================Test Cases =================================================================

// Test user can create a new page.
	     
	     // Navigate to the Product development Space
	     Dashboard_Page.clklinkHref_ProductDevSpace(driver) .click();
	     System.out.println(" Welcome to the Product Development Space");
	     
	     // Click On Create button to create New Page
	     PDHome_Page.btn_Create(driver).click();
	     PDHome_Page.btn_CreateCreate(driver).click();
	     
	     //Create New Page
	     PDHome_Page.txtbx_PageTitle(driver).sendKeys("New_QA_Page");
	     PDHome_Page.btn_Save(driver).click();
	     
	     //Validated New Page is created
	     PDHome_Page.clkLinkHref_NewPageText(driver).click();
	     System.out.println(" Welcome to the New QA Page");
	     
	    // Get the name of the New Page
	    System.out.println(NewPage_Page.txt_NewPageTitle(driver).getText());
	     
	     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	     
	    // Delete the New Page
	     NewPage_Page.menu_ActionMenu(driver).click();
	     NewPage_Page.txtLink_DeleteContent(driver).click();
	     NewPage_Page.btn_OkDelete(driver).click();
	     System.out.println(" New Page Deleted");
	     
	 
// Test User can set Restriction on existing page
	     
	     // Select the page to set Restrictions
	     PDHome_Page.clkLinkHref_DevHomePageText(driver).click();
	     System.out.println(" Welcome to the Dev Home Page");
	     
	     // Restrict Editing for the Dev Home Page to Only Me
	     PDHome_Page.menu_ActionMenu(driver).click();
	     PDHome_Page.txtLink_ActionMenuRestrictions(driver).click();
	     PDHome_Page.rbtn_RestrictEdit(driver).click();
	     PDHome_Page.btn_PermissionsMe(driver).click();
	     PDHome_Page.btn_PermissionsSave(driver).click();
	     
	     System.out.println("Dev Page Edit Restriction Added");
	     driver.quit();     
	}
	
	
}
