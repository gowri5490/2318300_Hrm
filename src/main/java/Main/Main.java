package Main;
import dataExcel.ExcelData;
import locate.LocateElement;
public class Main extends LocateElement {
	public static void main(String args[]) throws Exception
	{
		LocateElement le = new LocateElement();
		le.setupDriver();
		le.loginPage();
		String dash=le.dashBoard();
		String jRole=le.addJobRole();
		ExcelData.excelOutput(dash,jRole);
		le.submit();
		le.close();
		le.saveExtent();
		
		
		
	}

}
