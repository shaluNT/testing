package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
   
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
          System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver","/home/nt-dn12/automation/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.javatpoint.com");
System.out.println(driver.getTitle());
        assertTrue( true );
    }
}
