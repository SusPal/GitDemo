import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayita Pal\\eclipse-workspaceNew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
	    //driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/div/input")).sendKeys("Test");
		driver.findElement(By.xpath("//div[@class='A8SBwf sbfc']/div[3]/input[1]")).click();
		driver.findElement(By.xpath("//div[@class='gb_ae gb_i gb_xg gb_og']/div[2]")).click();

	}

}