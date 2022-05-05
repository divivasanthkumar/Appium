package testdemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

@SuppressWarnings({ "unused", "deprecation" })
public class Login extends App99acres{

	static AndroidDriver driver;

	@BeforeMethod
	public static void   beforeMethod() throws MalformedURLException {
		AndroidDriver driv = appiumMethod();
		driv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver=driv;
		//return driver;
	}

	//	@Test(priority=1)
	//	public void appRegistration() throws MalformedURLException, InterruptedException{
	//		driver.findElement(By.xpath("//*[@text='Profile']")).click();
	//		driver.findElement(By.xpath("//*[@text='Login / Register']")).click();
	//		driver.findElement(By.id("com.nnacres.app:id/registerButton")).click();
	//		driver.findElement(By.id("android:id/text1")).click();
	//		driver.findElement(By.xpath("//*[@text='OK']")).click();
	//		WebElement name = driver.findElement(By.xpath("//*[@text='Name']"));		
	//		name.click();
	//		name.sendKeys("Test User");
	//		driver.findElement(By.id("com.nnacres.app:id/mobile")).sendKeys("1180221128");
	//		driver.findElement(By.id("com.nnacres.app:id/password")).sendKeys("Asdfghjkl@8");
	//		driver.findElement(By.id("com.nnacres.app:id/registerSubmit")).click();
	//		driver.quit();
	//	}
	//
	//		@Test
	//		public void appLogin() throws MalformedURLException, InterruptedException{
	//			driver.findElement(By.id("com.nnacres.app:id/bottom_nav_profile")).click();
	//			driver.findElement(By.id("com.nnacres.app:id/profile_login_tv")).click();
	//			driver.findElement(By.id("com.nnacres.app:id/emailUsernameMobile")).sendKeys("test842021@gmail.com");
	//			driver.findElement(By.id("com.nnacres.app:id/continueButton")).click();
	//			driver.findElement(By.id("com.nnacres.app:id/passwordOrOtp")).sendKeys("Test842021@123");
	//			driver.findElement(By.id("com.nnacres.app:id/buttonOTPPasswordLogin")).click();
	//			Thread.sleep(2000);
	//			driver.findElement(By.id("com.nnacres.app:id/back")).click();
	//		}

	//		@Test
	//		public void appLogout() throws MalformedURLException, InterruptedException {
	//			driver.findElement(By.id("com.nnacres.app:id/bottom_nav_profile")).click();
	//			driver.findElement(By.id("com.nnacres.app:id/profile_logout_tv")).click();
	//			driver.findElement(By.xpath("//*[@text='YES']")).click();
	//			Thread.sleep(2000);
	//			driver.quit();
	//		}
	//	@Test
	//	public void appHamburger() throws MalformedURLException, InterruptedException {
	//		driver.findElement(By.id("com.nnacres.app:id/hamburger")).click();
	//		WebElement element =	driver.findElement(By.xpath("//*[@text='My Shortlists']"));	
	//		//		AndroidTouchAction action = new AndroidTouchAction(driver) ;
	//		//		WebElement first = driver.findElement(By.xpath("//*[@text='Home']"));
	//		//		WebElement second = driver.findElement(By.xpath("//*[@text='All India ']"));
	//		//		action.longPress(ElementOption.element(first)).moveTo(ElementOption.element(second)).release().perform();
	//		Thread.sleep(2000);
	//		driver.quit();
	//	}

	//	@Test(priority=2)
	//	public void appNavigation() throws MalformedURLException, InterruptedException{
	//		driver.findElement(By.xpath("//*[@text='Shortlisted']")).click();
	//		driver.findElement(By.id("com.nnacres.app:id/bottom_nav_recent_activity")).click();
	//		driver.findElement(By.xpath("//*[@text='Profile']")).click();
	//		driver.findElement(By.xpath("//*[@text='Home']")).click();
	//		driver.quit();
	//	}

	//	@Test(priority=3)
	//	public void appSearch() throws MalformedURLException, InterruptedException {
	//		driver.findElement(By.xpath("//*[@text='Search cities, localities, projects etc.']")).click();
	//		System.out.println("Search clicked");
	//		driver.findElement(By.id("com.nnacres.app:id/suggestionText")).click();	
	//		System.out.println("Suggest clicked");
	//	//	driver.findElement(By.xpath("//*[@text='ALLOW']")).click();	
	//	//	driver.findElement(By.id("	\r\n"
	//	//			+ "com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
	//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
	//		System.out.println("Location clicked");
	//		WebElement STR = driver.findElement(By.xpath("//*[@text='Search Locality,Projects,Landmarks..']"));	
	//		STR.sendKeys("Gachibowli");	
	//		driver.findElement(By.xpath("//*[@text='Next']")).click();	
	//		driver.findElement(By.id("com.nnacres.app:id/buttonSearch")).click();
	//		Thread.sleep(5000);
	//		driver.quit();


	//	@SuppressWarnings({ "rawtypes", "deprecation" })
	//	@Test
	//	public void scroll() throws MalformedURLException, InterruptedException{
	//		
	//	
	//		Dimension dim = driver.manage().window().getSize();
	//		int height = dim.getHeight();
	//		int width = dim.getWidth();
	//		int x = width/2;
	//		int top_y = (int)(height*0.40);
	//		int bottom_y = (int)(height*0.20);
	//		System.out.println("coordinates :" + x + "  "+ top_y + " "+ bottom_y);
	//		TouchAction ts = new TouchAction(driver);
	//		ts.longPress(ElementOption.point(x, 417)).moveTo(ElementOption.point(x, 1670)).release().perform();
	//	}


	//	@Test(priority=4)
	//	public void appRefresh() throws  MalformedURLException, InterruptedException {

	//		AndroidTouchAction action = new AndroidTouchAction(driver);
	//		WebElement source = driver.findElement(By.id("com.nnacres.app:id/tvTitle"));
	//		WebElement target = driver.findElement(By.id("com.nnacres.app:id/tvFooterTitle"));
	//		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).
	//		release().perform();


	//		ts.press(x, top_y).moveTo(x, bottom_y).release().perform();
	//				WebElement obj = (WebElement) driver.findElement(MobileBy.AndroidUIAutomator(
	//				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().description(\"Why trust 99acres\"));"));
	//				System.out.println("App Refrehsed");
	//				Thread.sleep(1000);
	//		UiScrollable bb =	new UiScrollable(new UiSelector()).ScrollIntoView("+"new UiSelector().
	//		descriptionContains(\"Why trust 99acres\"));
	//		driver.quit();
	//
	//	}



	//	@Test(priority=4)
	//	public void exploreCity()throws MalformedURLException, InterruptedException {
	//		driver.findElement(By.id("com.nnacres.app:id/ivCardImage")).click();
	//		driver.findElement(By.xpath("//*[@text='Where?']")).click();
	//		driver.findElement(By.xpath("//*[@text='Search Locality,Projects,Landmarks..']")).sendKeys("Hyderabad");
	//		driver.findElement(By.id("com.nnacres.app:id/name")).click();
	//		driver.findElement(By.xpath("//*[@text='Explore']")).click();
	//		driver.quit();
	//	}

	//		@Test
	//		public void appFilter() throws  MalformedURLException, InterruptedException {
	//			driver.findElement(By.xpath("//*[@text='Search cities, localities, projects etc.']")).click();			
	//			driver.findElement(By.id("com.nnacres.app:id/suggestionText")).click();		
	//			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();			
	//			WebElement STR = driver.findElement(By.xpath("//*[@text='Search Locality,Projects,Landmarks..']"));	
	//			STR.sendKeys("Gachibowli");	
	//			driver.findElement(By.xpath("//*[@text='Next']")).click();	
	//			driver.findElement(By.id("com.nnacres.app:id/buttonSearch")).click();
	//			Thread.sleep(5000);
	//			driver.findElement(By.id("com.nnacres.app:id/filter")).click();
	//			driver.findElement(By.id("com.nnacres.app:id/switchButton")).click();		
	//			driver.findElement(By.xpath("//*[@text='2 BHK']")).click();
	//			driver.findElement(By.id("com.nnacres.app:id/buttonSearch")).click();
	//			Thread.sleep(8000);
	//			System.out.println("Filtered 2 BHK flats");
	//			driver.quit();
	//		}
	//		@Test
	//		public void appSorting() throws  MalformedURLException, InterruptedException {
	//			driver.findElement(By.xpath("//*[@text='Search cities, localities, projects etc.']")).click();			
	//			driver.findElement(By.id("com.nnacres.app:id/suggestionText")).click();		
	//			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();			
	//			WebElement STR = driver.findElement(By.xpath("//*[@text='Search Locality,Projects,Landmarks..']"));	
	//			STR.sendKeys("Lingampally");	
	//			driver.findElement(By.xpath("//*[@text='Next']")).click();	
	//			driver.findElement(By.id("com.nnacres.app:id/buttonSearch")).click();
	//			Thread.sleep(5000);
	//			String first = driver.findElement(By.xpath("//*[@text='KAVERAAH RESIDENCY']")).getText();
	//			driver.findElement(By.id("com.nnacres.app:id/sort")).click();
	//			driver.findElement(By.xpath("//*[@text='Price: Low to High']")).click();
	//			String second = driver.findElement(By.xpath("//*[@text='Residential land / Plot in Huda Layout']")).getText();
	//			Assertion asertion = new Assertion( );
	//			asertion.assertNotEquals(first, second);
	//			System.out.println("Low to High sorted");
	//			driver.findElement(By.xpath("//*[@text='Remind later']")).click();
	//			driver.findElement(By.id("com.nnacres.app:id/buttonNever")).click();
	//			driver.quit();
	//		}

	//	@Test
	//	public void chatBot() throws  MalformedURLException, InterruptedException  {
	//		driver.findElement(By.xpath("//*[@text='Search cities, localities, projects etc.']")).click();			
	//		driver.findElement(By.id("com.nnacres.app:id/suggestionText")).click();		
	//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();			
	//		WebElement STR = driver.findElement(By.xpath("//*[@text='Search Locality,Projects,Landmarks..']"));	
	//		STR.sendKeys("Lingampally");	
	//		driver.findElement(By.xpath("//*[@text='Next']")).click();	
	//		driver.findElement(By.id("com.nnacres.app:id/buttonSearch")).click();
	//		Thread.sleep(5000);
	//		driver.findElement(By.id("com.nnacres.app:id/chatBotIcon")).click();
	//		System.out.println("ChatBot clicked");
	//		driver.findElement(By.xpath("//*[@text='Start Afresh']")).click();
	//		System.out.println("first clicked");
	//		driver.findElement(By.xpath("//*[@text='Hyderabad']")).click();
	//		System.out.println("second clicked");
	//		WebElement search = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.widget.EditText"));
	//		search.click();
	//		search.sendKeys("Lingampally");
	//		search.click();
	//		System.out.println("Area entered");	
	//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.Button")).click();
	//		driver.findElement(By.xpath("//*[@text='Apartment']")).click();
	//		driver.findElement(By.xpath("//*[@text='2 BHK']")).click();
	//	}

	//	@Test
	//	public void scrollPage() throws  MalformedURLException, InterruptedException {
	//		TouchActions action = new TouchActions(driver);
	//		action.scroll(driver, 10, 100);
	//		action.perform();
	//		driver.findElement(MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
	//		Thread.sleep(5000);
	//		driver.findElement(MobileBy.AndroidUIAutomator(
	//	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(100000)"));
	//		WebElement endView = driver.findElement(By.xpath("//*[@text='View All Testimonials']"));
	//		try
	//        {
	//            JavascriptExecutor js = (JavascriptExecutor) driver;    
	//            js.executeScript("arguments[0].scrollIntoView();", endView);
	//        }
	//        catch (Exception e)
	//        {
	//            System.err.println("Unable to scroll to webelement.  WebElement is not visible.");
	//        }
	//	}

		@Test
		public void appCommands() throws InterruptedException {
			String time = driver.getDeviceTime();
			System.out.println("Device time is:" + time);
			System.out.println("Device Orientation is :" + driver.getOrientation());	
//			driver.rotate(ScreenOrientation.LANDSCAPE);
//			System.out.println("Orientation changed to Landscape");
			System.out.println("Device Battery info is :" + driver.getBatteryInfo());
			System.out.println("Device Displaydensity is :" + driver.getDisplayDensity());	
			driver.lockDevice();
			System.out.println("Device is locked :" + driver.isDeviceLocked());
			driver.unlockDevice();
			System.out.println("Device is unlocked :" + driver.isDeviceLocked());
			System.out.println("Device Current Activity is :" + driver.currentActivity());
			System.out.println("Device Current Package is :" +  driver.getCurrentPackage());
//			driver.runAppInBackground(Duration.ofSeconds(5000));
//			driver.launchApp();
//			System.out.println("App running in background");
//			driver.activateApp("com.nnacres.app");
//			driver.executeScript("mobile: pressButton", ImmutableMap.of("name", "home"));
			driver.findElement(By.xpath("//*[@text='Profile']")).click();
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(2000);
			System.out.println("Back button pressed");			
			driver.pressKey(new KeyEvent(AndroidKey.HOME));
			Thread.sleep(2000);
			System.out.println("Home button pressed");
			Thread.sleep(2000);
			Activity activity = new Activity("io.appium.android.apis", ".ApiDemos");
			driver.startActivity(activity);
			Thread.sleep(2000);
			System.out.println("New App Activity launched");
	
		}
}