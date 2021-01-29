import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Selenium Code
		//Create Driver Object
		//We will strictly implement methods of ChromeDriver
		/* Create object of X Class
		  X driver=new X(); 
		 */
		//invoke .exc file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayita Pal\\eclipse-workspaceNew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://in.yahoo.com/");
		driver.close();
		driver.quit();
		
				
	}

}
