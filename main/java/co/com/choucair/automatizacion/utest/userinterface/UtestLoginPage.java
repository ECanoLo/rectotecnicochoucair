package co.com.choucair.automatizacion.utest.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.TargetBuilder;
import org.openqa.selenium.By;

public class UtestLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the form to login").located
            (By.xpath("//div[@class='d-none d.lg.block']//strong[contains(text(),'Log In')]"));
    public static final Target INPUT_USER = Target.the("Where do we write the emailuser").located
            (By.id("emailUser"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located
            (By.xpath("//button[contains(@class, 'btn btn-primary')]"));

}
