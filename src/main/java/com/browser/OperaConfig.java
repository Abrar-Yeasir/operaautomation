package com.browser;

import org.openqa.selenium.WebDriver;

public class OperaConfig {

public static WebDriver driver;

    public static void main(String[] args) {

    }
    public static void launch_opera(){
       System.setProperty("webdriver.opera.driver","./src/main/resources/operadriver.exe");
    }
}
