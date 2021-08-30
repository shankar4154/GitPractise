package AppiumPkg.Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class SwipeDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// attribute("value")

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();

		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();

		driver.findElementByXPath("//*[@content-desc='9']").click();

		TouchAction touch = new TouchAction(driver);

		WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second = driver.findElementByXPath("//*[@content-desc='45']");

		touch.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2)))
				.moveTo(element(second)).release().perform();

	}

}
