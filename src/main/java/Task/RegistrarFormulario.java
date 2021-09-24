package Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static Userinterfaces.DetalleFormulario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarFormulario implements Task {

    private String nombre;
    private String apellido;
    private String contraseña;
    private String direccion;
    private String ciudad;
    private String estado;
    private String codigoPostal;
    private String pais;
    private String telefono;
    private String alias;

    public RegistrarFormulario(String nombre, String apellido, String contraseña, String direccion, String ciudad, String estado, String codigoPostal, String pais, String telefono, String alias ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.telefono = telefono;
        this.alias = alias;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(INPUT_PRIMER_NOMBRE), //
                Enter.theValue(apellido).into(INPUT_APELLIDO),
                Enter.theValue(contraseña).into(INPUT_CONTRASEÑA),
                Enter.theValue(direccion).into(DIRECCION),
                Enter.theValue(ciudad).into(CIUDAD),
                SelectFromOptions.byVisibleText(estado).from(ESTADO),
                Enter.theValue(codigoPostal).into(CODIGO_POSTAL),
                SelectFromOptions.byVisibleText(pais).from(PAIS),
                Enter.theValue(telefono).into(TELEFONO),
                Enter.theValue(alias).into(ALIAS),
                Click.on(BUTTON_REGISTRAR) // Buton crear cuenta
        );

    }
    public static RegistrarFormulario NuevoUsuario(String nombre, String apellido, String contraseña, String direccion, String ciudad, String estado, String codigoPostal, String pais, String telefono, String alias) {
        return instrumented(RegistrarFormulario.class, nombre, apellido, contraseña, direccion,ciudad, estado, codigoPostal, pais, telefono, alias);
    }
}
