package Userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleProducto{

        public static final Target INPUT_CANTIDAD = Target.the("Input cantidad").located(By.id("quantity_wanted"));
        public static final Target SELECT_TALLA = Target.the("Select talla").located(By.id("group_1"));
        public static final Target SELECT_COLOR = Target.the("Select Color").located(By.id("color_8"));
        public static final Target BOTON_ANADIR_CARRITO = Target.the("Botón añadir al carrito").locatedBy("//button[contains(@type, 'submit') and contains(@class, 'exclusive')]");
        public static final Target BOTON_IR_AL_CARRITO = Target.the("Botón ir al carrito").locatedBy("//a[contains(@title, 'Proceed to checkout')]");

}
