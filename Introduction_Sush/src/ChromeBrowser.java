import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayita Pal\\eclipse-workspaceNew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://faceook.com");
		/*driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgotten password?")).click();*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("emailid");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='u_0_f']/div[3]/a")).click();
		
		
		
	}
}
