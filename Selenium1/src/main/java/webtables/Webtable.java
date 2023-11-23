package webtables;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	
	WebDriver driver;
	@Test
	public void webtable1() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://cosmocode.io/automation-practice-webtable/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 List<WebElement>  countries=driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
	 int row=countries.size();
	 System.out.println(row);
	 String tablerowxpath="//*[@id='countries']/tbody/tr[";
	 String tablerowxpath2="]";
	 String tabledataxpath="//*[@id='countries']/tbody/tr[";
	 String tabledataxpath2="]/td[1]";
	 for(int i=2;i<=row;i++) {
		 
		 String tablefullrowxpath=
		 
	 }
	 
		
	}

}
