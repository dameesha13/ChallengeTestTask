package com.test.project.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

    static WebDriver driver;

    public static WebDriver setUp() {

        //set driver location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dameesha Sarathchand\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        //Initialize the webDriver
        driver = new ChromeDriver();

        //Pass the url
        driver.get("https://www.amazon.com/");

        //Maximize the Window
        driver.manage().window().maximize();

        return driver;

    }

}
