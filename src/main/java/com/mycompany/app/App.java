package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver","/home/nt/code/jenkins/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.javatpoint.com");
        System.out.println(driver.getTitle());
        
    }
}
