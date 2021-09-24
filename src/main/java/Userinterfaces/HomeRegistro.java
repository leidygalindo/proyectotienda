package Userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomeRegistro extends PageObject{
   public static final Target BUTTON_SING_IN = Target.the("Boton para registro").locatedBy("//a[contains(@class, 'login') and contains(@title, 'Log in to your customer account')]");
   public static final Target INPUT_CORREO = Target.the("Ingresar el correo").located(By.id("email_create"));
   public static final Target BUTTON_CREAR_CUENTA = Target.the("Crear cuenta").locatedBy("//button[contains(@type, 'submit') and contains(@id, 'SubmitCreate')]");
}