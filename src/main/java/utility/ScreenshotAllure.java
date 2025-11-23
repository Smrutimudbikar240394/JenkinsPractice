package utility;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;

public class ScreenshotAllure {



    public static void attachScreenshot(WebDriver driver) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

        Allure.addAttachment("Failure Screenshot", new ByteArrayInputStream(screenshot));
    }


}
