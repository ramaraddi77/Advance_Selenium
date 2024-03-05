package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class fetchthemultipleDataFromExcel
{
	@Test
	public static void GetData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("‪./Excel/Book.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		for(int i=1;i<rows;i++)
		{
			if(rows<15||rows>35)
			{
			Row row = sheet.getRow(i);
			}
			System.out.println(i);
		}
		
	}
}