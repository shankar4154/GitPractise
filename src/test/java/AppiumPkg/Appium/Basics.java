package AppiumPkg.Appium;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementByClassName("android.widget.CheckBox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		Thread.sleep(2000);
		//driver.findElementByXPath("//android.widget.EditText[@id='android:id/edit']").sendKeys("hello");	
		driver.findElementById("android:id/edit").sendKeys("hello");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		driver.findElementByClassName("android.widget.CheckBox").click();

	}

}
