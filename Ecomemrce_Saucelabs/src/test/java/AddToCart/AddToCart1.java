package AddToCart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ecom.genericUtilities.FileUtility;
import pomrepository.LoginPage;

public class AddToCart1 
{
	@Test
	public void AddToCart1() throws IOException
	{
			FileUtility fLib=new FileUtility();
			WebDriver driver=new ChromeDriver();
			LoginPage ll=new LoginPage(driver);
			driver.manage().window().maximize();
			driver.get(fLib.getDataFromProperties("url"));
//			driver.findElement(By.id("user-name")).sendKeys(fLib.getDataFromProperties("user1"),Keys.TAB,fLib.getDataFromProperties("password"),Keys.ENTER);
			ll.loginToApp(fLib.getDataFromProperties("user1"), fLib.getDataFromProperties("password"));
			driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']/../../following-sibling::div/button[text()='Add to cart']")).click();
			String actual=driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).getText();
			driver.findElement(By.id("shopping_cart_container")).click();
			String expected=driver.findElement(By.xpath("//div[contains(text(),'Fleece Jacket')]")).getText();
			Assert.assertTrue(actual.contains(expected));
			System.out.println("pass");
	}
}
