package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    //Webdriver=variabila care ne ajuta sa interactionam cu site-ul si elementele dintr-un site

    public WebDriver driver;

    @Test
    public void testAutomat(){
        // specificam unde se afla driverul pentru browser
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        //deschidem un browser
        driver = new ChromeDriver();
        //introducem o adresa
        driver.get("http://demo.automationtesting.in/Index.html");
        //scimbam rezolutia in full-screen
        driver.manage().window().maximize();

        //identificam elementul "sign in"
        WebElement signInELEMENT = driver.findElement(By.id("btn1"));
        //Facem un click
        signInELEMENT.click();

        //identificare element dupa locators: ID,class,name,link,CSS,xpath.
//css
        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "alexwwww22@gmail.com";
        emailElement.sendKeys(emailValue);
//xpath
        WebElement parolaElement= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String parolaValue="FroZen2K";
        parolaElement.sendKeys(parolaValue);

        WebElement loginElement = driver.findElement(By.id("enterbtn"));
        loginElement.click();


    }
}
