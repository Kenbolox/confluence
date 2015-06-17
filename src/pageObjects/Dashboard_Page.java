package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_Page {
	private static WebElement element = null;
	 
    public static WebElement clklinkHref_ProductDevSpace(WebDriver driver){
    	element = driver.findElement(By.linkText("Product Development"));
         return element;
}
}