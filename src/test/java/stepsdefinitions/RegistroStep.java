package stepsdefinitions;
import Userinterfaces.HomeRegistro;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import Task.*;

public class RegistroStep {

    @Managed(driver="chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Leidy");
    private HomeRegistro homeRegistro= new HomeRegistro();



    @Given("^que un nuevo cliente se loge en la pagina web$")
    public void queUnNuevoClienteSeLogeEnLaPaginaWeb() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homeRegistro));
    }

    @When("^Diligenciar (.*) valido para el registro con (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void diligenciarLeidyHotmailComValidoParaElRegistro(String correo, String nombre, String apellido, String contraseña, String direccion, String ciudad, String estado, String codigoPostal, String pais, String telefono, String alias) {
        actor.wasAbleTo(
               RegistrarUsuario.correovalido(correo),
              RegistrarFormulario.NuevoUsuario(nombre, apellido, contraseña, direccion,ciudad, estado, codigoPostal, pais, telefono, alias)
     );
    }


    @Then("^el se loguea en la pagina web$")
    public void elSeLogueaEnLaPaginaWeb() {
    }








}
