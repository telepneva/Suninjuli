import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ValueX {
    ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/C:/Users/anyut/chromedriver.exe");
        driver = new ChromeDriver();
        String BASE_URL = "https://suninjuly.github.io/math.html";
        driver.get(BASE_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.manage().window().maximize();
    }

    @Test
    public void calculationX() {
        WebElement inputLine = driver.findElement(By.id("answer"));
        //WebElement inputValueX = driver.findElement(By.id("input_value"));
        inputLine.findElement(By.id("input_value"));


        //WebElement inputValueX = driver.findElement(By.id("input_value"));

        WebElement buttonCheckbox = driver.findElement(By.id("robotCheckbox"));
        buttonCheckbox.click();

        WebElement radioButton = driver.findElement(By.id("robotsRule"));
        radioButton.click();

        WebElement submitButton = driver.findElement(By.cssSelector("[class='btn btn-default']"));
        submitButton.click();

    }




    @After
    public void TearDown() {
        driver.quit();
    }
}
