package com.mindtree.Utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mindtree.ReusableComponents.Base;




public class ScreenShots extends Base{
	
	
	
	public static void getScreenshotonPass(String result) throws IOException
	{   
		String filepath=ConfigProperty.prop.getProperty("passedcasepath");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(filepath+result+"screenshot.jpg"));
	
	}
	public static void getScreenshotonFail(String result) throws IOException
	{   
		String filepath=ConfigProperty.prop.getProperty("failedcasepath");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(filepath+result+"screenshot.jpg"));
	
	}
}
