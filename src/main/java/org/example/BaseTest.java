package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod(alwaysRun = true, description = "Open web browser")
    public void aaa_setUp() {
        SelenideConfig.createBrowserConfig("chrome");
        SelenideLogger.addListener("Allure", new AllureSelenide().savePageSource(false).screenshots(true));
        Selenide.open("https://google.com");
    }

    @AfterMethod(alwaysRun = true, description = "Close web browser")
    public void zzz_tearDown() {
        Selenide.closeWebDriver();
    }
}
