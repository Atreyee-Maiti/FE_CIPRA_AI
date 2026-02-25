
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    protected AndroidDriver driver;

    @Before
    public void setup() throws Exception {
        driver = DriverManager.getDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
