package AppiumPkg.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class DragandDrop extends HybridBase{

	public static void main(String[] args) throws MalformedURLException {

		
		
		AndroidDriver<AndroidElement> driver = capabilities("Real");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// attribute("value")

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		TouchAction touch = new TouchAction(driver);
		
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = driver.findElementsByClassName("android.view.View").get(1);

		
		//touch.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		
		touch.longPress(element(source)).moveTo(element(destination)).release().perform();
		
		

		
	}

}
