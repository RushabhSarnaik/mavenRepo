package programPratic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver","D:\\Notes\\Automation Testing\\chromedriver.exe");		
		System.setProperty("webdriver.gecko.driver","D:\\Notes\\Automation Testing\\geckodriver.exe");		
		
		
//		ChromeOptions options= new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//	//	WebDriver driver=new ChromeDriver(options);
		WebDriver driver=new FirefoxDriver();
		
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://demoqa.com/droppable/");
		
		Thread.sleep(2000);
		WebElement drag=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		Thread.sleep(2000);
		WebElement drop=driver.findElement(By.xpath("(//div[@id=\"droppable\"])[1]"));
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		
		
		driver.quit();
	}

}
