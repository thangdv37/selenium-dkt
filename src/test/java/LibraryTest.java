/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
    	System.setProperty("webdriver.chrome.driver","C://chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
    }
}