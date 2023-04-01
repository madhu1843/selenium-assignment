package madhu.seleniumtest;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriverException;

public class Seleniumtestass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DevOps classes\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Hi,welcome to selenium testcases");
		
		driver.get("http://35.170.72.33:8082/addressbook/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("brendon");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("john");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("1111111111");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("4/30/92,");
		driver.findElement(By.className("v-button-primary")).click();
		System.out.println("TestCase Executed");
		Thread.sleep(5000);
		//driver.quit();
	}
}




