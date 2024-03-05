package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class write_the_data_Into_excel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.createRow(1);
		
		Cell cell = row.createCell(3);

		cell.setCellValue("TopGun");
		
		FileOutputStream fos = new FileOutputStream("./Excel/Book1.xlsx");
		
		book.write(fos);
		
	}

}
