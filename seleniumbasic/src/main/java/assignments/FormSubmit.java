package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/form");
		WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='first-name']"));
		firstNameInput.sendKeys("Biju");
		WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='last-name']"));
		lastNameInput.sendKeys("V");
		WebElement jobTitleInput = driver.findElement(By.xpath("//input[@id='job-title']"));
		jobTitleInput.sendKeys("Software Engineer");
		WebElement educationradiobutton = driver.findElement(By.xpath("//input[@id='radio-button-2']"));
		educationradiobutton.click();
		WebElement genderCheckBox = driver.findElement(By.xpath("//input[@id='checkbox-1']"));
		genderCheckBox.click();
		WebElement experienceDropDown = driver.findElement(By.xpath("//select[@id='select-menu']//option[5]"));
		experienceDropDown.click();
		WebElement dateInput = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateInput.sendKeys("09\02\2024");
		WebElement submitButton = driver.findElement(By.xpath("//a[text()='Submit']"));
		submitButton.click();
		driver.navigate().to("https://formy-project.herokuapp.com/thanks");
		WebElement thanksMsg = driver.findElement(By.xpath("//h1[text()='Thanks for submitting your form']"));
		System.out.println(thanksMsg.getText());
	}

}
