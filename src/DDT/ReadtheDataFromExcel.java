package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadtheDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//step 1
		FileInputStream fis = new FileInputStream("./Excel/Book1.xlsx");
		//step 2
		Workbook book = WorkbookFactory.create(fis);
		//step 3
		Sheet sh = book.getSheet("Sheet1");
		//step 4
		Row r = sh.getRow(0);
		//step 5
		Cell c = r.getCell(0);
		//step 6
		String value = c.getStringCellValue();
		System.out.println(value);
		

	}

}
