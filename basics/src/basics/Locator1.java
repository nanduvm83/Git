package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.AlertHandler;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//this is for setting crome driver path 	
	System.setProperty("webdriver.chrome.driver", "N:\\Softwares\\Selenium Jars 3.1\\chromedriver\\chromedriver.exe");	
  //creating object for the driver
	WebDriver driver = new ChromeDriver();
	///invoking to the browser 
    driver.get("http://www.facebook.com");
    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("naiks842@gmail.com");
    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("azmoiera0893");
    driver.findElement(By.xpath("//*[@id='u_0_n']")).click();
    //driver.switchTo(Alert.allow);
    driver.findElement(By.xpath("//*[@id='u_7_2']/input[2]")).sendKeys("srinath nayak");
	}

///formula for xpath	
  // xpath = //tagname[@attribute='value'] , (or)xpath = //*[@attribute='value']
	// Xpath Using by Traversing Tag Names: reg_form_box;
	// CSS = tagname[attribute='value'] (or) CSS = [attribute='value']
	// CSS = #ID Name, .classname , Find the unique attribute. ex: ID
	// a= Anchor element which the PathLink is working or not .
}
