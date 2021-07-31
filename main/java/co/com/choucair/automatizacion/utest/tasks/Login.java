package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.nibor.autolink.internal.EmailScanner;

public class Login implements Task {
    private String emailUser;

    public Login(String emailUser, String strPassword) {
        this.emailUser = emailUser;
        this.strPassword = strPassword;
    }

    private String strPassword;
    public static  Login onThePage(String emailUser,String strPassword){
        return Tasks.instrumented(Login.class, emailUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLoginPage.LOGIN_BUTTON),
                Enter.theValue(emailUser).into(UtestLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(UtestLoginPage.INPUT_PASSWORD),
                Click.on(UtestLoginPage.ENTER_BUTTON)
        );
    }
}
