package reading_from_file_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleValues {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File path = new File("./resources/data1.xlsx");
		FileInputStream fis = new FileInputStream(path);
		
		Workbook data = WorkbookFactory.create(fis);
		
		int rowCount = data.getSheet("Sheet1").getPhysicalNumberOfRows();
		int cellCount = data.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		
		String[][] arr = new String[rowCount][cellCount];
		
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				arr[i][j] = data.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
		}
		
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
