package co.com.choucair.automatizacion.utest.tasks;

import co.com.choucair.automatizacion.utest.userinterface.UtestCoursesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Search implements Task {
    private String course;
    public Search(String course) {
        this.course = course;
    }



    public static Search the(String course) {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestCoursesPage.BUTTON_UC),
                Enter.theValue(course).into(UtestCoursesPage.INPUT_COURSE),
                Click.on(UtestCoursesPage.BUTTON_GO),
                Click.on(UtestCoursesPage.SELECT_COURSE)
        );

    }
}
