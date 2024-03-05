package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTgemultipleData 
{
	public static FileInputStream fis;
	public static void Getdata(String sh) throws EncryptedDocumentException, IOException
	{
		try 
		{
			fis=new FileInputStream("./Excel/ram.xlsx");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int trows = sheet.getPhysicalNumberOfRows();
		for(int i=1;i<=trows;i++)
		{
			Row row = sheet.getRow(i);
			int tcells = row.getPhysicalNumberOfCells();

			for (int j = 1; j <=tcells; j++)
			{
				Cell cell = row.getCell(i);
				String value = cell.toString();
				System.out.print(value+"    ");
			}
			System.out.println( );
		}
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
		Getdata("Sheet1");
	}
}









