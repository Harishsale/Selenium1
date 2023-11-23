package webtables;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class exceltest {
	
	@DataProvider
	  public String[] [] Data() throws Throwable {
		  File file=new File("./target/Log.xlsx");
			FileInputStream fileinput=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fileinput);
			XSSFSheet sheet=workbook.getSheetAt(0);
//			System.out.println(sheet.getPhysicalNumberOfRows());
			int rows=sheet.getPhysicalNumberOfRows();
			int cells=sheet.getRow(1).getLastCellNum();
			String [] []example=new String[rows-1] [cells];
		
			for(int i=0;i<rows-1;i++) {
				for(int j=0;j<cells;j++) {
					DataFormatter dataformat=new DataFormatter();
			//		System.out.println(dataformat.formatCellValue(sheet.getRow(i).getCell(j)));
					example[i] [j]=dataformat.formatCellValue(sheet.getRow(i+1).getCell(j));
				
				}
			}
			workbook.close();
			fileinput.close();
			return example;

}
}