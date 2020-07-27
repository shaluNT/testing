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
    
     System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver","/home/nt/code/jenkins/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.javatpoint.com");
System.out.println(driver.getTitle());
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
