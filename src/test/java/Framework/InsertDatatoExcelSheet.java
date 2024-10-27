package Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDatatoExcelSheet {

	public static void main(String[] args) throws Throwable, IOException {


		FileInputStream fes = new FileInputStream("C:\\Users\\HP\\Downloads\\ExcelData.xlsx");
		
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.createRow(5);
		Cell cel = row.createCell(5);
		cel.setCellValue("Qspider");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Downloads\\ExcelData.xlsx");
		book.write(fos);
		book.close();
		
	}

}
