package xPath;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
		String filepath = "C:\\Users\\bijuv\\Documents\\Java.docx";
		//chooseFile.sendKeys(filepath);
		File file = new File(filepath);
		chooseFile.sendKeys(file.getAbsolutePath());
	}
	

}
