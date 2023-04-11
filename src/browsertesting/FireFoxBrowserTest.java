package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome Browser
        WebDriver driver = new FirefoxDriver();

        //Open the Url into Browser
        driver.get(baseUrl);

        //Maximize the Browser
        driver.manage().window().maximize();

        //We give Implicit wait to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the Title of the Page
        String title = driver.getTitle();
        System.out.println(title);

        //Get the current Url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the username field element and type the username into the username field
        driver.findElement(By.name("user[email]")).sendKeys("abc123@xyz.com");

        //Find the password field element and type the password into the password field
        driver.findElement(By.name("user[password]")).sendKeys("Admin123");

        //Close the Browser
        driver.close();
    }
}
