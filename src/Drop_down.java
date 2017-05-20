import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_down {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	 
		//driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("hrvatski");
		Select select=new Select(driver.findElement(By.xpath("//*[@id='year']")));
		select.selectByIndex(3);
		List<WebElement>Totallist=select.getOptions();
		System.out.println(Totallist.size());
		for(int i=0;i<Totallist.size();i++){
			System.out.println(Totallist.get(i).getText());
		
		}
		List<WebElement>options=driver.findElements(By.xpath("options"));
		System.out.println(options.size());
         for(int i=0;i<options.size();i++){
        	 System.out.println(options.get(i).getAttribute("lang"));
        	 
         }
		
			List<WebElement>links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			for(int i=0;i<links.size();i++){
	        System.out.println(links.get(i).getAttribute("href"));
				
			}
			
			
			
		}
		
			
			
				

				
	

	}


