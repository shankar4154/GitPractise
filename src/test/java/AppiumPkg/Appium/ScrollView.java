package AppiumPkg.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollView extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// attribute("value")

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		
		driver.findElementByAndroidUIAutomator("text(\"WebView\")").click();
		
		
	}

}
