package Task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static Userinterfaces.HomeRegistro.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public  class RegistrarUsuario implements Task{

    private String correo;
    public RegistrarUsuario(String correo){
        this.correo = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(BUTTON_SING_IN) ,// Ingresar al registro
            Enter.theValue(correo).into(INPUT_CORREO), // Diligenciar correoClick.on(BUTTON_CREAR_CUENTA) // Ingresar al formulario
            Click.on(BUTTON_CREAR_CUENTA) // Buton crear cuenta
        );

    }
    public static RegistrarUsuario correovalido(String correo) {
        return instrumented(RegistrarUsuario.class, correo);
    }
}

