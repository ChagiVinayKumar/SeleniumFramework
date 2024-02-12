package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelUtils(String excelName, String sheetName)
	{
		try {
		projectpath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(projectpath+"/TestData/"+excelName);
		sheet = workbook.getSheet(sheetName);
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		getRowCount();
		getCelldataString(1,0);
		getCelldataNumber(1,1);
	}
	
	public static int getRowCount()
	{	
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("RowCount:"+rowcount);
			return rowcount;
		
	}
	public static int getColumnCount()
	{	
			int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("ColumnCount:"+columncount);
			return columncount;
		
	}
	public static String getCelldataString(int rowNum, int columnNum) {
			String cellData= sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
			//System.out.println(cellData);
			return cellData;
		
	}
	public static void getCelldataNumber(int rowNum, int columnNum) {
			double cellData= sheet.getRow(rowNum).getCell(columnNum).getNumericCellValue();
			System.out.println(cellData);
		
	}

}
