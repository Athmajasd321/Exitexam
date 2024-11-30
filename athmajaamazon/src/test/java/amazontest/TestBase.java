package amazontest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
WebDriver driver;
Properties prop;

public void readprop() throws IOException {
	prop=new Properties();
	FileInputStream input=new FileInputStream("D:\\AathmajasdST\\eclips\\athmajaamazon\\src\\test\\resources\\configprop");
	prop.load(input);
}
@BeforeMethod
public void setconfig() throws IOException {
	readprop();
	driver=new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterMethod
public void TearDown() {
	driver.quit();
}
    



}
