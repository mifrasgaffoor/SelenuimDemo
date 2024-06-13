package org.example.selenuim;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloChrome {


    public static void main(String[] args) {

        System.out.println("testing for working");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println("Ttile : "  + driver.getTitle());

    // Locator


}}
