package Utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelUtils excel = new ExcelUtils("TestDataSheet.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getCelldataString(1, 0);
		excel.getCelldataNumber(1, 1);
	}

}
