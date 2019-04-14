package day7;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReadingConcept {

	public static String ExcelDataRetrival(int sheetNo,int rowNum, int colName)  {
		
		String data= null;
		File src =new File("E:\\Ashu Automation Lab\\Data.xlsx");
        FileInputStream fis;
		try {
			fis = new FileInputStream(src);
        
        XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(sheetNo);
		data = sheet1.getRow(rowNum).getCell(colName).getStringCellValue();
		}
		catch(Exception e) { System.out.println(e);}
		 return data;
	}

}
