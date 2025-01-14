package Selenium;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelSheet {

    void handleSheet() throws IOException {
        FileInputStream file = new FileInputStream("/Users/shrinivaslondhe/Desktop/fileeee.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet=workbook.getSheetAt(0);
        Row row=sheet.getRow(2);
        Cell cell=row.getCell(5);
        String value=cell.getStringCellValue();
        System.out.println(value);


    }
}
