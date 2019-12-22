package Utils;

public class UseXLSX {
	
	public static void main(String args[]) {
		Xls_Reader obj = new Xls_Reader("C:\\Users\\Sarthak Chadha\\Desktop\\New folder\\try.xlsx");
		System.out.println(obj.getColumnCount("Sheet1"));
		
		obj.setCellData("Sheet1", "ID", 2, "3");
		obj.setCellData("Sheet1", "Name", 2, "ABC");
		
		obj.setCellData("Sheet1", "ID", 3, "4");
		obj.setCellData("Sheet1", "Name", 3, "ABCD");
		
		System.out.println(obj.getCellData("Sheet1", "ID", 2)+"----"+obj.getCellData("Sheet1", "Name", 2));
		System.out.println(obj.getCellData("Sheet1", "ID", 3)+"----"+obj.getCellData("Sheet1", "Name", 3));
		
		
		
	}

}
