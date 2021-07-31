package co.com.choucair.automatizacion.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestCoursesPage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona el curso de testing").located
            (By.xpath("//div[@id='academy']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el Curso").located(By.id("coursssearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").located
            (By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso").located
            (By.xpath("//h4[contains(text(),'Testing Basics')]"));
    public static final Target NAME_COURSE = Target.the("Extraer el nombre del curso").located
            (By.xpath("//h1[contains(text(),'Testing Basics')]"));

}
