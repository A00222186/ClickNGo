package frontEndTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUserTest {

	public static void main(String[] args) {
		
		String exePath = "C:\\Program Files\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/ClickNGo/useraccount.jsp");
		
		String title = driver.getTitle();
		String curUrl = driver.getCurrentUrl();
		String pgSource = driver.getPageSource();
		System.out.println(title);
		System.out.println(curUrl);
		System.out.println(pgSource);
		
		driver.quit();
	

	}

}
