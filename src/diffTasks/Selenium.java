/*package DiffTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class Selenium {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\julia\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
        driver =new FirefoxDriver();
        String baseUrl = "http://ya.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get(baseUrl + "/");
        driver.findElement(By.id("text")).click();
        driver.findElement(By.id("text")).clear();
        driver.findElement(By.id("text")).sendKeys("EPAM");
        driver.findElement(By.cssSelector("input.b-form-button__input")).click();
        driver.quit();
        System.out.println("Completed");
}
}
*/



