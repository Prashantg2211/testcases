package fi.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCase {
	
	WebDriver driver;
	
	public void launchBrowser()  
	
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.amazon.in/");
		driver.get("https://www.amazon.in/");
	}

	public void serachProduct() throws InterruptedException {
		
		//Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone12");
		//Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-text")).click();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Today's Deals")).click();
		//Thread.sleep(4000);
		
	}
	public void navigate() throws InterruptedException {
		
		driver.navigate().to("https://www.cdac.in");
		System.out.println("the Title is == > " +driver.getTitle());
		//Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/");
		//Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().to("https://www.gmail.com/");
	}
	
//	public void opencdaccontact() throws InterruptedException {
//		
//		driver.findElement(By.linkText("Products & Services")).click();
//		//Thread.sleep(3000);
//		driver.findElement(By.linkText("C-DAC Corporate Office"));
//	}
	
	public void opengmail() {
		driver.findElement(By.id("identifierId")).sendKeys("prashantgrj515@gmail.com");
		//driver.close();
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.id("password")).sendKeys("12344455");	
	}
	
	public void closebrowser() {
		driver.quit();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		FirstCase ob = new FirstCase();
		ob.launchBrowser();
		ob.serachProduct();
		ob.navigate();
//		ob.opencdaccontact();
		ob.opengmail();
		ob.closebrowser();
	}

}

