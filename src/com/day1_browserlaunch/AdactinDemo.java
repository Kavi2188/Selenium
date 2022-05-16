package com.day1_browserlaunch;

public class AdactinDemo extends Base_Class {
public static void main(String[] args) {
	browserLaunch("Chrome");
	get("https://adactinhotelapp.com/");
	Pom_Login pl= new Pom_Login(driver);
	
	
	
	
	
	
	sendKeys(pl.getUsername(), "Prathibha7");
	sendKeys(pl.getPassword(), "Thanvika");
	click(pl.getLogin());
	
	
}
}
