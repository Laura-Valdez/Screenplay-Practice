package starter.questions;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.ui.SwagLabStoreUI;

public class SwagLabStoreQuestions {

    public static Question<String> ProductsAvailable(){
        return actor -> Text.of(SwagLabStoreUI.PRODUCTS_TITLE).answeredBy(actor);
    }

    public static Question<String> ValuasAvailable(){
        return actor -> Text.of(SwagLabStoreUI.PRODUCTS_TITLE).answeredBy(actor);
    }

}
