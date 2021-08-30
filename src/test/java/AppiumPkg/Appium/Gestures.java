package AppiumPkg.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class Gestures extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//attribute("value")
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
		
		TouchAction touch = new TouchAction(driver);
		
		WebElement custom = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		//for tapping
		touch.tap(tapOptions().withElement(element(custom))).perform();
		
		WebElement peoplenames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		
		touch.longPress(longPressOptions().withElement(element(peoplenames)).withDuration(ofSeconds(2))).release().perform();
		
		System.out.println(driver.findElementById("android:id/title").isDisplayed());

	}

}
