package stepsdefinitions;
import Task.AgregarProducto;
import Task.BuscarProducto;
import Userinterfaces.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class TiendaStep {

    @Managed (driver="chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Leidy");
    private HomePage homePage = new HomePage();


    @Given("^que un nuevo cliente ascede hasta la pagina web de compras$")
    public void queUnNuevoClienteAscedeHastaLaPaginaWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }


    @When("^el agrega (.*) productos (.*) talla (.*) al carro de compras$")
    public void elAgregaUnProductoAlCarro(String cantidad, String descripcion, String talla) {
       actor.wasAbleTo(
                BuscarProducto.condescripcion(descripcion),
                AgregarProducto.detalle(cantidad, talla)
        );

    }

    @Then("^el ve el producto en el carro de compras$")
    public void elVeElProductoEnElCarroDeCompras() {

    }


}
