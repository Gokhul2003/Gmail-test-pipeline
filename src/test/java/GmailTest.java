import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailTest {

    @Test
    public void openGmail() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOKHUL.K\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
