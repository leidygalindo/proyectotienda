package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;


import static Userinterfaces.DetalleProducto.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto  implements Task {

    private String talla;
    private String cantidad;

    public AgregarProducto(String cantidad, String talla){

        this.cantidad = cantidad;
        this.talla = talla;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cantidad).into(INPUT_CANTIDAD), //Ingresar Cantidad
                SelectFromOptions.byVisibleText(talla).from(SELECT_TALLA), //Seleccionar "TALLA"
                Click.on(SELECT_COLOR), //Seleccionar "COLOR"
                Click.on(BOTON_ANADIR_CARRITO), //Agregar al carrito
                Click.on(BOTON_IR_AL_CARRITO) // ir al carrito de compras
        );
    }

    public static AgregarProducto detalle(String cantidad, String talla) {
        return instrumented(AgregarProducto.class, cantidad, talla);
    }
}
