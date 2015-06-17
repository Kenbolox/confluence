package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PDHome_Page {
	
	// PDHome Page Objects
	
		private static WebElement element = null;
		 // Create button
		 public static WebElement btn_Create(WebDriver driver){
	         element = driver.findElement(By.id("create-page-button"));
	         return element;
	 
	         }
		 // Create Content pop-up Create button
		 public static WebElement btn_CreateCreate(WebDriver driver){
	         element = driver.findElement(By.xpath("/html/body/div[13]/div/div[2]/button"));
	         return element;
	 
	         }
		 // New Page Title Box
		 public static WebElement txtbx_PageTitle(WebDriver driver){
		    	element = driver.findElement(By.id("content-title"));
		         return element;
		         
		    }
		  //New Page Save button       
		 public static WebElement btn_Save(WebDriver driver){
			     element = driver.findElement(By.id("rte-button-publish"));
			      return element;

            }
		 // Link to the New Created Page
		 public static WebElement clkLinkHref_NewPageText(WebDriver driver){
		     element = driver.findElement(By.linkText ("New_QA_Page"));
		     return element;

           }
		// Link to the DEV Home Page
		public static WebElement clkLinkHref_DevHomePageText(WebDriver driver){
	         element = driver.findElement(By.linkText ("DEV Home Page"));
		     return element;

		           }
		 // Action Menu [...] button
		 public static WebElement menu_ActionMenu(WebDriver driver){
		    	element = driver.findElement(By.id("action-menu-link"));
		         return element;

		    }
		 // Action Menu > Restrictions Link
		 public static WebElement txtLink_ActionMenuRestrictions(WebDriver driver){
		    	element = driver.findElement(By.id("action-page-permissions-link"));
		         return element;
		         
		    }
		 // Page Restriction Popup Restrict Edit Radio button
		 public static WebElement rbtn_RestrictEdit(WebDriver driver){
	         element = driver.findElement(By.id("restrictEditRadio"));
	         return element;
	 
	         }
		 //  Page Restriction Popup Me Button
		 public static WebElement btn_PermissionsMe(WebDriver driver){
	         element = driver.findElement(By.id("page-permissions-choose-me"));
	         return element;
	 
	         }
		 // Page Restriction Popup Save Button
		 public static WebElement btn_PermissionsSave(WebDriver driver){
			 element = driver.findElement(By.xpath("/html/body/div[15]/div/div[2]/button"));
			 return element;
			 
			 }
		 
		 
}