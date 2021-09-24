package Userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {
    public static final Target INPUT_BUSCAR_ARTICULO = Target.the("Input donde se realizar la búsqueda").located(By.id("search_query_top"));
    public static final Target BUTTON_BUSCAR_ARTICULO = Target.the("Botón buscar artículo").located(By.className("submit_search"));
    public static final Target LINK_ARTICULO_ENCONTRADO = Target.the("Link objeto encontrado").locatedBy("//a[starts-with(@class,'product_img_link') and contains(@title, 'Blouse')]");
}
