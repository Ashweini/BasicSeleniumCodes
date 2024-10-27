package Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelSheet {

	public static void main(String[] args) throws Throwable, IOException {


//Apache poi Dependecies need to be added- get maven repositories for dependency
		//step 1 : path connection
		//FileInputStream fin = new FileInputStream("C:\\Users\\HP\\Downloads\\ExcelData.xlsx");
		//or
		FileInputStream fin = new FileInputStream("./src/test/resources/ExcelData.xlsx");
		
		//step 2 : Excel file(workbook) - create in a read mode - workbook interface imported here 
		Workbook book = WorkbookFactory.create(fin);
		
		//step -3 : getting the cobstrol of sheet
		Sheet sheet = book.getSheet("sheet1");
		
		//step 4 : getting control to rownum'
		Row row = sheet.getRow(8);
		
		//step 5 : getting control to cell
		Cell cel = row.getCell(3);
		
		String cellData = cel.getStringCellValue();
		System.out.println(cellData);
	}

}
