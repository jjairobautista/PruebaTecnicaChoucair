package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairSearchPage extends PageObject
{

    public static final Target COURSE = Target.the("Ingresa el curso Guías Técnicas - Analista Financial").
            located(By.xpath("//*[@class='card-img dashboard-card-img']"));

    public static final Target VALIDATE = Target.the("Validacion De Ingreso al Curso").
            located(By.xpath("//*[@id=\"sectionid-1036-title\"]/span/a"));


}
