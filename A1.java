import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1
{
	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://jqueryui.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement demo = driver.findElement(By.linkText("Demos"));
		demo.click();
		Thread.sleep(5000);
		
		WebElement draggable = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[1]/a"));
		draggable.click();
		Thread.sleep(5000);
		
		WebElement droppable = driver.findElement(By.linkText("Droppable"));
		droppable.click();
		Thread.sleep(5000);
		
		WebElement resizable = driver.findElement(By.linkText("Resizable"));
		resizable.click();
		Thread.sleep(5000);
		
		WebElement selectable = driver.findElement(By.linkText("Selectable"));
		selectable.click();
		Thread.sleep(5000);
		
		WebElement sortable = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[5]/a"));
		sortable.click();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
