package AppiumPkg.Appium;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class HybridBase {
    
	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		
		File parent = new File("src//main//java//Resources");
		File app = new File(parent, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		if(device.equalsIgnoreCase("Emulator")) {
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ManiEmulator");
		} else if (device.equalsIgnoreCase("Real")) {
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath() );
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;
		
	}
 
}
