package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_Multipledata_Inexcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./Additional SW/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://snowcityblr.com/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count = alllinks.size();
		System.out.println(count);
		
		FileInputStream fis = new FileInputStream("./Excel/Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		for (int i = 0; i<count;i++)
		{
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
		
			WebElement links = alllinks.get(i);
			String value = links.getAttribute("href");
			cell.setCellValue(value);
			System.out.println(value);
			
		}
		
		
		FileOutputStream fos = new FileOutputStream("./Excel/Book1.xlsx");
		book.write(fos);
		
		

	}

}
