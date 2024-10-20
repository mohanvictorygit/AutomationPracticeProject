package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;

public class Inventory extends BaseClass {
	
	 static By productName=By.xpath("//a[@id='item_1_title_link']");
	 static By extractproductName=By.xpath("//div[@class='inventory_details_name']");
	 static By Menu=By.xpath("//*[contains(text(),'Open Menu')]");
	 static By Allitems=By.xpath("//*[contains(text(),'All Items')]");
	 
	 
	 public static void ClickProductName() {
		
		 driver.findElement(productName).click();
		 
	 }
	 
	 public static String VerifyProductName()
	 {
		 String productname=driver.findElement(extractproductName).getText();
		 return productname;
	 }
	 
	 public static void ClickMenu()
	 {
		 //new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Open Menu')]"))).click();
		// driver.findElement(Allitems).click();
		 WebElement myElement = driver.findElement(By.xpath("//*[contains(text(),'Open Menu')]"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", myElement);
	 }
	 
	 public static void clickAllItems()
	 {
		 driver.findElement(Allitems).click();
	 }
	 

}
