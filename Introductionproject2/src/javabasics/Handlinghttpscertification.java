package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Handlinghttpscertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Program Files//geckodriver//geckodriver.exe");
		FirefoxProfile prof = new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
		WebDriver driver = new FirefoxDriver(prof);
	}

}
