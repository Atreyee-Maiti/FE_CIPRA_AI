
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin(){
        LoginPage login = new LoginPage(driver);
        login.login("test@mail.com","123456");
    }
}
