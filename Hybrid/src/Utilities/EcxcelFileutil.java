package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class EcxcelFileutil

{
	Workbook wb;

	public EcxcelFileutil() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("./Excelfile/InputSheet.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
	}

	public int rowCount(String Sheetname)

	{

		return wb.getSheet(Sheetname).getLastRowNum();

	}

	public int colCount(String Sheetname, int Rownum) {
		return wb.getSheet(Sheetname).getRow(Rownum).getLastCellNum();

	}

	public String getData(String Sheetname, int Rownum, int colCount) {

		String data = "";
		if (wb.getSheet(Sheetname).getRow(Rownum).getCell(colCount)
				.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC) {
			int celldata = (int) wb.getSheet(Sheetname).getRow(Rownum).getCell(colCount).getNumericCellValue();
			String.valueOf(celldata);
		} else {
			data = wb.getSheet(Sheetname).getRow(Rownum).getCell(colCount).getStringCellValue();
		}
		return data;

	}

}
