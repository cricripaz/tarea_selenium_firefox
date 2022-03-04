import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicFirefox {



    WebDriver driver = new FirefoxDriver();

    @BeforeEach
    public void openBrowser(){

        System.setProperty("webdriver.gecko.driver","/Users/cristianpaz/Desktop/QA_2022/tarea_selenium/src/test/resources/driver/geckodriver");

        driver = new FirefoxDriver();

        driver.get("https://www.google.com/");


    }


    @Test
    public void goToGoogle() throws InterruptedException {

        Thread.sleep(5000);

    }


    @AfterEach
    public void closeBrowser(){


        driver.quit();
    }


}
