package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepository {
    @Test
    void shouldFindSelenideAsRepository(){
        open("https://github.com/");
        $("[data-target='qbsearch-input.inputButtonText']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid='results-list']").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
}
