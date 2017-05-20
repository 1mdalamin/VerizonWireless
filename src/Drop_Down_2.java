
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_Down_2 {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		Select select=new Select (driver.findElement(By.xpath("//*[@id='year']")));
		
		select.selectByIndex(5);
		
	
	List<WebElement>Totallist=select.getOptions();
	System.out.println(Totallist.size());
	
	for(int i=0; i<Totallist.size();i++){
		System.out.println(Totallist.get(i).getText());
	}
	
  }
     }
