package com.MyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
	System.out.println("World cup");

	System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get("http://www.facebook.com");
    }
}
