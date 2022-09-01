package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import static core.DriverFactory.getDriver;

public class TakeScreenShot {
    Date data = new Date();
    public void Screenshot(String name) {

        TakesScreenshot screenShot = ((TakesScreenshot) getDriver());
        File source = screenShot.getScreenshotAs(OutputType.FILE);
        String fileName = "src/test/resources/Evidencias/" + data.today() +"-"+ name + System.currentTimeMillis() + ".png";
        try {
            FileHandler.copy(source, new File(fileName));
            System.out.println("Screenshot capturado e salvo " + fileName);
        } catch (IOException e) {
            System.err.println("--------------- Erro ao salvar Screenshot --------------- " + e.getMessage());
            System.err.println("--------------- Causa do erro ---------------" + e.getCause());
        }
    }
}
