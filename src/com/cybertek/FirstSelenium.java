package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cybertekstudio/Desktop/selenium_dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
