package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairLoginPage;

public class Login implements Task {
    private String user;
    private String pass;

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    private ChoucairLoginPage choucairLoginPage;

    public static Performable onThePage(String user, String pass) {
        return Tasks.instrumented(Login.class,user,pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(choucairLoginPage.LOGIN_BUTTON),
                Enter.keyValues(user).into(choucairLoginPage.INPUT_USER),
                Enter.keyValues(pass).into(choucairLoginPage.INPUT_PASS),
                Click.on(choucairLoginPage.INGRESAR_BUTTON));
    }
}
