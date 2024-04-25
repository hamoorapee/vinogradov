package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {
    @Test
    void andreiSolntsevShouldContributeTheMost(){
        //open Selenide page
        open("https://github.com/selenide/selenide");
        //bring mouse over the first icon of contributors
        $(".Layout-sidebar").$(byText("Contributors"))
                .ancestor(".BorderGrid-cell").$$("ul li").first().hover();
        //check: popup is showing Andres Solntsev
        $(".Popover").shouldHave(text("Andrei Solntsev"));
    }
}
