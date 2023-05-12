/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ganes
 */
public class PricelineTest {
     private WebDriver driver;
    
    public PricelineTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {   
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
         driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
   
      @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.google.com/search?q=priceline&oq=&aqs=chrome.0.35i39i362l8.123021752j0j15&sourceid=chrome&ie=UTF-8");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//div[@id='tads']/div/div/div/div/div/a/div/span")).click();
    driver.get("https://www.priceline.com/?kw=priceline&match=e&adp=&refid=PLGOOGLECPCB&refclickid=d%3AcBRAND16833045450g46024356878310937388672kwd-10842441%7C9021560%7C&gclid=CjwKCAjw3ueiBhBmEiwA4BhspAzEY2ZAPGLnyAds85-Hgjw53V3ODOeKjlaoTg0FLV5iHiZH2OmitBoCCm4QAvD_BwE&slingshot=1081");
    driver.close();
  }
  
  


 
}
