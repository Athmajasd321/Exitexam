package amazontest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import amazonpages.HomePage;

public class HomeTest extends TestBase {

	HomePage HP;
	
	@BeforeTest
	public void setup() {
		HP=new HomePage(driver);
	}
	
	@Test(priority=1)
	public void verifyelements() throws Exception {
		HP=new HomePage(driver);
		HP.verifyelements();
	}
	
	
	@Test
	public void signin() throws InterruptedException {
		HP=new HomePage(driver);
		HP.signinclick();
		HP.setname(prop.getProperty("Name"));
		HP.setemail(prop.getProperty("Email"));
		HP.setpass(prop.getProperty("password"));
		HP.enterpass(prop.getProperty("password"));
		HP.conclick();
	}
	
	@Test
	public void setlng() throws InterruptedException {
		HP=new HomePage(driver);
		HP.setlngs(prop.getProperty("language"));
	}
	
	@Test
	public void searchproduct() {
		HP=new HomePage(driver);
		HP.setsearch(prop.getProperty("Search"));
		HP.setsortclick();
	}
	
	@Test
	public void selectproduct() {
		HP=new HomePage(driver);
		HP.setsearch(prop.getProperty("Search"));
		HP.setsortclick();
		HP.select();
		HP.setorder();
	}
}
