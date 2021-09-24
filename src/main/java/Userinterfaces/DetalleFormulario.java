package Userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleFormulario {
    public static final Target INPUT_PRIMER_NOMBRE = Target.the("Digitar Primer nombre").locatedBy("//input[contains(@type, 'text') and contains(@id, 'customer_firstname')]");
    public static final Target INPUT_APELLIDO = Target.the("Digitar apellido").locatedBy("//input[contains(@type, 'text') and contains(@id, 'customer_lastname')]");
    public static final Target INPUT_CONTRASEÑA = Target.the("Digitar contraseña").locatedBy("//input[contains(@type, 'password') and contains(@id, 'passwd')]");
    public static final Target DIRECCION = Target.the("Direccion").locatedBy("//input[contains(@type, 'text') and contains(@id, 'address1')]");
    public static final Target CIUDAD = Target.the("Ciudad").locatedBy("//input[contains(@type, 'text') and contains(@id, 'city')]");
    public static final Target ESTADO = Target.the("Estado").located(By.id("uniform-id_state"));
    public static final Target CODIGO_POSTAL = Target.the("Codigo Postal").located(By.id("postcode"));
    public static final Target PAIS = Target.the("Pais").located(By.id("uniform-id_country"));
    public static final Target TELEFONO = Target.the("Telefono").located(By.id("phone"));
    public static final Target ALIAS = Target.the("digitar un alias").located(By.id("alias"));
    public static final Target BUTTON_REGISTRAR = Target.the("REGISTRAR").located(By.id("submitAccount"));
}



