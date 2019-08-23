import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChromeBrowser {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		 cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		 cap.setCapability("chromedriverExecutable", "C:\\Users\\Onur\\Desktop\\chromedriver.exe");
	 
	    // cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		
		AndroidDriver<AndroidElement>  driver=  new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.get("http://facebook.com");

		driver.findElementByXPath("//*[@id=\'m_login_email\']").sendKeys("qwerty");
		driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("12345");
		driver.findElementByXPath("//*[@id=\'signup-button\']").click();

	}

}
