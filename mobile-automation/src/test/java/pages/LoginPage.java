
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {
    private AndroidDriver driver;

    private By email = By.id("com.example.cipra:id/userEmail_input");
    private By password = By.id("com.example.cipra:id/userPassword_input");
    private By loginBtn = By.id("com.example.cipra:id/SignIn_btn");

    public LoginPage(AndroidDriver driver){
        this.driver = driver;
    }

    public void login(String e,String p){
        driver.findElement(email).sendKeys(e);
        driver.findElement(password).sendKeys(p);
        driver.findElement(loginBtn).click();
    }
}
