package co.com.choucair.automatizacion.utest.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.TargetBuilder;
import org.openqa.selenium.By;

public class UtestLoginPage extends PageObject {
    public static final Target INPUT_USER = Target.the("Where do we write the emailuser").located
            (By.id("//*[@id="username"]"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").located(By.id("//*[@id="password"]"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located
            (By.xpath("//*[@id="kc-login"]"));
    public static final Target LOGIN_BUTTON = Target.the("Button that open Academy").located
            (By.xpath("/html/body/ui-view/nav-sidebar/div/nav/div[3]/nav-sidebar-item[2]/div/a/div[2]"));

}
