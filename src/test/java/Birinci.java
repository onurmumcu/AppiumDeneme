import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Birinci extends Base {

	public static void main(String[] args) throws MalformedURLException {
	
		AndroidDriver<AndroidElement>  driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://google.com");
		
//		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//	     driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
//	     driver.findElementById("android:id/checkbox").click();
//	     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
//	     driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
//	     driver.findElementsByClassName("android.widget.Button").get(1).click();
//	     
	     
	     
		//driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
		
		//driver.scrollTo("Preference").click();
		
	}

}
