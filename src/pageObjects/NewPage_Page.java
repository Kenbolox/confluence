package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPage_Page {
	
	private static WebElement element = null;
	 
    public static WebElement txt_NewPageTitle(WebDriver driver){
    	element = driver.findElement(By.id("title-text"));
         return element;

    }
    
    public static WebElement menu_ActionMenu(WebDriver driver){
    	element = driver.findElement(By.id("action-menu-link"));
         return element;

    }
    
    public static WebElement txtLink_DeleteContent(WebDriver driver){
    	element = driver.findElement(By.id("action-remove-content-link"));
         return element;

   }
    
    public static WebElement btn_OkDelete(WebDriver driver){
        element = driver.findElement(By.id("confirm"));
        return element;

        }
}