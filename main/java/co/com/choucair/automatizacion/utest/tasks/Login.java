package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.nibor.autolink.internal.EmailScanner;

public class Login implements Task {
    private String usser_email;

    public Login(String usser_email, String password) {
        this.usser_email = usser_email;
        this.password = password;
    }

    private String password;
    public static  Login onThePage(String usser_email,String password){
        return Tasks.instrumented(Login.class, usser_email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLoginPage.LOGIN_BUTTON),
                Enter.theValue(usser_email).into(UtestLoginPage.INPUT_USER),
                Enter.theValue(password).into(UtestLoginPage.INPUT_PASSWORD),
                Click.on(UtestLoginPage.ENTER_BUTTON)
        );
    }
}
