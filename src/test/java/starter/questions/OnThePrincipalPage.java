package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.ui.SwagLabStoreUI;

public class OnThePrincipalPage implements Question {

    public static Question<String> theTitlesIs(){
        return new OnThePrincipalPage();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(SwagLabStoreUI.PRODUCTS_TITLE).getText();
    }
}
