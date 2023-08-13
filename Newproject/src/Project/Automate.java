package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver  driver=new ChromeDriver();	
				//visit google.com.
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				
				//Search for "pubg".
				driver.findElement(By.name("q")).sendKeys("pubg");
				Thread.sleep(2000);
				driver.findElement(By.name("q")).clear();
				
				//search for "games in india".
				driver.findElement(By.name("q")).sendKeys("games in india");
				driver.findElement(By.className("gNO89b")).click();
				Thread.sleep(2000);
				
				//click on random website.
				driver.findElement(By.xpath("/html/body/div[6]/div/div[13]/div[2]/div[1]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div/div[1]/div/a/h3")).click();
				driver.findElement(By.linkText("Sport in India § Traditional games")).click();
				
				Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				//Scroll down
				js.executeScript("window.scrollBy(0,5000)");
				Thread.sleep(3000);
				
				//scroll up
				js.executeScript("window.scrollBy(0,-20000)"); //js.javaScript("window.scroolBy(0,1500)");
				Thread.sleep(2000);
				
				//random click on link
				WebElement link=driver.findElement(By.xpath("//*[@id='mw-content-text']/div[1]/p[2]/a[5]"));
				js.executeScript("arguments[0].scrollIntoView(true);", link);
				
				Thread.sleep(1000);
				link.click();
				
				//Browse site
				WebElement link1=driver.findElement(By.xpath("//*[@id=\"footer-places-about\"]/a"));
				js.executeScript("arguments[0].scrollIntoView(true);", link1); 
				
				Thread.sleep(1000);
				
				WebElement link2=driver.findElement(By.xpath("//*[@id='mw-content-text']/div[1]/div[2]/a"));
				js.executeScript("arguments[0].scrollIntoView(true);", link2);
				
				driver.close();
					
	}  
				
				 
}
				 
				
				 
				 
				 
				 
				 
				 
				 
				 
				 
	
