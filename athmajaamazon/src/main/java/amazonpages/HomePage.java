package amazonpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
WebDriver driver;

public HomePage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}


public void verifyelements() throws Exception{
	//to verify amazon logo is displayed
	
	Thread.sleep(1000);
	boolean isDisplayed=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
	
	if (isDisplayed) {
		System.out.println("amazon logo is displayed.");
		
	} else {
        System.out.println("amazon logo is not displayed.");
	}
}

public void signinclick() throws InterruptedException {
	Thread.sleep(1000);
	//to create an account
	
	WebElement account=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	account.click();
	WebElement sign=driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
	sign.click();
	WebElement create=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
	create.click();
}
public void setname(String Name) {
	//verify name field
	
	WebElement name=driver.findElement(By.id("ap_customer_name"));
	name.sendKeys(Name);		
}
public void setemail(String Email) {
	// verify email field
	
	WebElement email=driver.findElement(By.id("ap_email"));
	email.sendKeys(Email);
}
public void setpass(String password) {
	//verify password field
	
	WebElement pass=driver.findElement(By.id("ap_password"));
	pass.sendKeys(password);
}
public void enterpass(String password) {
	//re enter same password
	
	WebElement pass=driver.findElement(By.id("ap_password_check"));
	pass.sendKeys(password);
}
public void conclick() {
	//selecting continue button
	
	WebElement con=driver.findElement(By.xpath("//input[@id='continue']"));
	con.click();
}


public void setlngs(String language) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
//		selecting language dropdown
		
	WebElement lng=driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[2]/div/label/span"));
	lng.sendKeys(language);
	lng.sendKeys(Keys.RETURN);
	}	


public void setsearch(String Search) {
	//To search a product
	
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys(Search);
	WebElement search1=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	search1.click();
}

public void setgender(String Gender) {
	//selecting gender field
	
	WebElement gender=driver.findElement(By.xpath("//span[@class='a-size-base a-color-base a-text-bold']"));
	gender.sendKeys(Gender);
}


public void setsortclick() {
	//To sort the product
	
	WebElement sort=driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
	sort.click();
	WebElement sort1=driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']"));
	sort1.click();
}

public void select() {
	// TODO Auto-generated method stub
	//selecting a product
	
	 WebElement select=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div[2]/div[1]/h2/a/span"));
	    select.click();
}

public void setorder() {
	//To order selected product
	
	WebElement order=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
  order.click();
}






}


