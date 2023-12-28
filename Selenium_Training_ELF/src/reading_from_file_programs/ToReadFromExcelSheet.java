package reading_from_file_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadFromExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step1: Creating FIS
		File abspath = new File("./resources/Daya.xlsx");
		FileInputStream fis = new FileInputStream(abspath);
		
		//Step2: Respective file object
		Workbook workbook = WorkbookFactory.create(fis);
		
		
		//Step3: read methods
		System.out.println(workbook.getSheet("Sheet1").getRow(8).getCell(4).getStringCellValue());
		System.out.println(workbook.getSheet("Sheet1").getRow(18).getCell(10).getLocalDateTimeCellValue());
		System.out.println(workbook.getSheet("Sheet1").getRow(12).getCell(14).getNumericCellValue());
		System.out.println(workbook.getSheet("Sheet2").getRow(12).getCell(3).getStringCellValue());
		System.out.println(workbook.getSheet("Sheet2").getRow(6).getCell(9).getNumericCellValue());
		System.out.println(workbook.getSheet("Sheet2").getRow(22).getCell(16).getLocalDateTimeCellValue());
	}
}