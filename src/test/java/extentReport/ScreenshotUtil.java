package extentReport;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.utils.FileUtil;

public class ScreenshotUtil {
	
	WebDriver driver;
	
	public static String getScreenshot(WebDriver driver)
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/Screenshot/"+ System.currentTimeMillis()+".png";
		File dest=new File(path);
		
		try {
			FileUtils.copyFile(src,dest);
		}
		catch(IOException e)
		{
			System.out.println("Capture Failed"+e.getMessage());
		}
		
		
		return path;
	}
	

}
