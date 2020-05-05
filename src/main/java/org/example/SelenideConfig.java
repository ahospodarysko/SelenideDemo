package org.example;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SelenideConfig {

    public static void createBrowserConfig(String browser) {
        Configuration.browser = browser;
        Configuration.startMaximized = true;
        Configuration.fastSetValue = true;
        Configuration.savePageSource = false;
        Configuration.screenshots = true;
        Configuration.pollingInterval = 5000;
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 60000;

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
    }
}
