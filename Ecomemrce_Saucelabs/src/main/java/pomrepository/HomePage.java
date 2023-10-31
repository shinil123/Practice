package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//Declaration
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addToCartbutton;
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement openMenu;
	
	@FindBy(id="logout_sidebar_link")
	private WebElement logout;
	
	//Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getaddToCart()
	{
		return addToCart;
	}
	
	public WebElement getAddToCartButton()
	{
		return addToCartbutton;
	}
	
	public WebElement getMenu()
	{
		return openMenu;
	}
	
	public WebElement getLogout()
	{
		return logout;
	}
	
	//business libraries
	public void addToCart()
	{
		addToCart.click();
	}
	
	public void attToCartbutton()
	{
		addToCartbutton.click();
	}
	
	public void menu()
	{
		openMenu.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	
}
