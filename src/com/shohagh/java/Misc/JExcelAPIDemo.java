package com.shohagh.java.Misc;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.biff.FontRecord;
import jxl.biff.drawing.ComboBox;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.CellFormat;
import jxl.format.Colour;
import jxl.format.Font;
import jxl.format.Format;
import jxl.format.Orientation;
import jxl.format.Pattern;
import jxl.format.VerticalAlignment;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFeatures;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/*
 * Edit this comment
 * @author Md.Ahsan Kabir/BJIT Ltd.
 * @date Apr 5, 2018
 */

public class JExcelAPIDemo {
	public static void main(String[] args) throws BiffException, IOException,
			WriteException {
		WritableWorkbook wworkbook = Workbook.createWorkbook(new File(
				"output.xls"));
		WritableSheet wsheet = wworkbook.createSheet("First Sheet", 0);
		Label label = new Label(0, 1, "A label record");
		label.setCellFeatures(new WritableCellFeatures());
		label.getWritableCellFeatures().setComment("Test comment");
		label.getWritableCellFeatures().setComboBox(new ComboBox());
		wsheet.addCell(label);
		wsheet.addCell(new Label(3,1, "PI"));
		Number number = new Number(3, 4, 3.1459);
		wsheet.addCell(number);
		wworkbook.write();
		wworkbook.close();

		Workbook workbook = Workbook.getWorkbook(new File("output.xls"));
		Sheet sheet = workbook.getSheet(0);
		Cell cell1 = sheet.getCell(0, 1);
		System.out.println(cell1.getContents());
		Cell cell2 = sheet.getCell(3,1);
		Cell cell3 = sheet.getCell(3, 4);
		System.out.println(cell2.getContents());
		System.out.println(cell3.getContents());
		workbook.close();
	}
}
