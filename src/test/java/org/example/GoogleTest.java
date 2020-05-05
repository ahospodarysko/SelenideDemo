package org.example;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static org.assertj.core.api.Assertions.assertThat;

public class GoogleTest extends BaseTest {

    @Test(description = "Google Selenide demo test")
    public void googleTest() {
        $x("//input[@name='q']").setValue("selenide").submit();
        List<SelenideElement> searchTitles = $$x("//div[@class='r']//h3");

        searchTitles.forEach(title -> assertThat(title.text()).containsIgnoringCase("Selenide"));
    }
}
