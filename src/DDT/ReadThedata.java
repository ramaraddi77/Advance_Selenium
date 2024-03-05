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

public class ReadThedata 
{
	public static FileInputStream fis;
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		fis=new FileInputStream("‪./Excel/Book.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
//		Row r = sheet.getRow(1);
//		Cell cell = r.getCell(1);
//		String value = cell.toString();
//		System.out.println(value);
		
		Row row = sheet.createRow(3);
		Cell cell = row.createCell(2);
		cell.setCellValue("Amit");
		
		FileOutputStream fos=new FileOutputStream("./Excel/Book.xlsx‪");
		book.write(fos);
		
	}

}
