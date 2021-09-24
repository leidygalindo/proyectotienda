package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static Userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class BuscarProducto implements Task {

    private String description;
    public BuscarProducto(String description){
        this.description = description;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(description).into(INPUT_BUSCAR_ARTICULO), // Diligenciar campo de busqueda
                Hit.the(Keys.ENTER).into(INPUT_BUSCAR_ARTICULO), //Click enter, lanzar busqueda
                Click.on(LINK_ARTICULO_ENCONTRADO.of(description))
        );

    }

    public static BuscarProducto condescripcion(String descripcion) {
        return instrumented(BuscarProducto.class, descripcion);
    }


}
