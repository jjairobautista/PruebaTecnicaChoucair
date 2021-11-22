package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").
            located(By.xpath("//a[@class='btn btn-info btn-sm text-white']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("where do we write the user ").
            located(By.id("username"));

    public static final Target INPUT_PASS = Target.the("where do we write the pass").
            located(By.id("password"));

    public static final Target INGRESAR_BUTTON = Target.the("button to confirm login").
            located(By.xpath("//*[@id=\"Ingresar\"]/div/div/div[2]/div[2]/form/div[3]/button"));
}
