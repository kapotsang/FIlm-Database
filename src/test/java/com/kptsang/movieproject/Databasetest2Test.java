package com.kptsang.movieproject;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Databasetest2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void databasetest2() {
    driver.get("http://localhost:3000/");
    driver.manage().window().setSize(new Dimension(795, 824));
    driver.findElement(By.cssSelector("form:nth-child(3) > input:nth-child(1)")).click();
    driver.findElement(By.cssSelector("form:nth-child(3) > input:nth-child(1)")).sendKeys("ace");
    driver.findElement(By.cssSelector(".btn-info")).click();
    assertThat(driver.switchTo().alert().getText(), is("You searched for ace"));
    driver.findElement(By.cssSelector("input:nth-child(4)")).click();
    assertThat(driver.switchTo().alert().getText(), is("You\'ve added "));
  }
}
