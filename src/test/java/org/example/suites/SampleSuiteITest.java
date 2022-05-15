package org.example.suites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleSuiteITest {
  @Test
  public void test() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ali\\IdeaProjects\\TestNGfws\\src\\test\\resources\\chromedriver.exe");

    // Instantiate a ChromeDriver class.
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    System.out.println("Test passed");
  }

}