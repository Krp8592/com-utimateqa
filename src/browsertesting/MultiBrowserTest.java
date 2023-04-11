package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "FireFox";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //Get the base url
        driver.get(baseUrl);

        //Maximize the browser
        driver.manage().window().maximize();

        //We give Implicit wait to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Get the Title of the Page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current URL
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page Source : " + driver.getPageSource());

        //Find the username field element and type the username in username field element
        driver.findElement(By.name("user[email]")).sendKeys("abc123@xyz.com");

        //Find the password field element and type the password in password field element
        driver.findElement(By.name("user[password]")).sendKeys("Admin123");

        //Close the browser
        //driver.close();
    }
}
