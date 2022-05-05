package testdemo;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class App99acres {

	public static AndroidDriver appiumMethod() throws MalformedURLException {

		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dcap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		dcap.setCapability(MobileCapabilityType.APP,
				"D:\\Divi Vasanth\\Training Details\\Appium\\APKs\\com.nnacres.app_2022-03-30.apk");
		dcap.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driv = new AndroidDriver(url, dcap);
//		Thread.sleep(5000);
//		driv.findElement(By.xpath("//*[@text='Search cities, localities, projects etc.']")).click();
//		Thread.sleep(3000);
//		driv.findElement(By.id("com.nnacres.app:id/suggestionText")).click();
//		Thread.sleep(2000);
//		driv.findElement(By.xpath("//*[@text='ALLOW']")).click();
//		Thread.sleep(2000);
//		WebElement STR = driv.findElement(By.xpath("//*[@text='Search Locality,Projects,Landmarks..']"));
//		Thread.sleep(2000);
//		STR.sendKeys("Gachibowli");
//		Thread.sleep(2000);
//		driv.findElement(By.xpath("//*[@text='Next']")).click();
//		Thread.sleep(2000);
//		driv.findElement(By.xpath("//*[@text='See all 1,365 Properties']")).click();
//		driv.findElement(By.xpath("//*[@text='Profile']")).click();
		return driv;

	}

}
