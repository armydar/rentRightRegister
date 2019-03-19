package rrOneAgency;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgencyRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Algorism-Adefemi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://develop.rentright.co/");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div[2]/span/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div[2]/ul/div/li[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[4]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[2]/div[1]/input")).sendKeys("asdf");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[2]/div[2]/input")).sendKeys("asdf");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[3]/input")).sendKeys(".#$154");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[4]/input")).sendKeys("asdf@oo.co");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[5]/input")).sendKeys("asdf");
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[6]/div/label[1]/span[1]/input")).click();
		
		List  oRadioButton = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[6]/div/label[1]/span[1]/input"));

		// Create a boolean variable which will hold the value (True/False)

		boolean bValue = false;

		// This statement will return True, in case of first Radio button is selected

		bValue = ((WebElement) oRadioButton.get(0)).isSelected();

		// This will check that if the bValue is True means if the first radio button is selected

		if(bValue = true){

		// This will select Second radio button, if the first radio button is selected by default

		((WebElement) oRadioButton.get(1)).click();

		}else{

		// If the first radio button is not selected by default, the first will be selected

		((WebElement) oRadioButton.get(0)).click();

		}

		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/button/div")).click();

	}

}
