package com.imdb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    static WebDriver driver;
    static HomePage home;
    static SignInMenuPage menu;
    static LoginPage login;

    public static void configurarPrueba() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        home = new HomePage();
        menu = new SignInMenuPage();
        login = new LoginPage();
    }
}
