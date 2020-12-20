package TestData;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader 
{
    FileInputStream fis = null;
    
    public Object [][] ReadDataFromExcel(int index,int colNum) throws IOException
    {
    	String filePath = System.getProperty("user.dir")+"\\ExcelSheets\\ExcelSheets.xlsx";
    	File fil = new File(filePath);
    	fis = new FileInputStream(fil);
    	
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sheet = wb.getSheetAt(index);
    	
    	int rowNum = sheet.getLastRowNum()+1;
    	
    	String [][] data = new String [rowNum][colNum];
    	
    	for(int row =0;row<rowNum;row++)
    	{
    		for(int col=0;col<colNum;col++)
    		{
    			XSSFRow sheetRow = sheet.getRow(row);
    			data[row][col] = sheetRow.getCell(col).toString();
    		}
    	}
    	wb.close();
    	return data;
    }
}
