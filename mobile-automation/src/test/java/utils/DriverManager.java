
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class DriverManager {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() throws Exception {
        if (driver == null) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "Android Emulator");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.example.cipra");
            caps.setCapability("appActivity", ".LoginPage");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        }
        return driver;
    }
}
