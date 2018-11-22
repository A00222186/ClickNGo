package SeleniumTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminMenuTest {
	
	public static void main(String [] args) {
	String exePath = "chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://localhost:8080/ClickNGo/AdminMenu.jsp");
	
	try {
		Thread.sleep(5000);
		String title = driver.getTitle();
		String curUrl = driver.getCurrentUrl();
		String pgSource = driver.getPageSource();
	
		System.out.println(title);
		System.out.println(curUrl);
		System.out.println(pgSource);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
	}
}
