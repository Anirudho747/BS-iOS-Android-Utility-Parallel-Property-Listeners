package listeners;

import bs.Base118;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestListener implements ITestListener {

    public void onTestFailure(ITestResult result)
    {
        if(result.getThrowable() != null) {
            //Whatever actions needs to be done
        }

        Base118 bs118 = new Base118();
        File file = bs118.getDriver().getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file,new File("SampleScreen.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
