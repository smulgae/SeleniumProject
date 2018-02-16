import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Selenium {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com");
	//driver.findElement(By.name("field-keywords")).sendKeys("TOYS");
	}

}
