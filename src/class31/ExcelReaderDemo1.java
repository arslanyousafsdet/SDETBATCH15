package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //Location of file on the computer
        String path="Files/Book1.xlsx";
        //Navigating to the file
        FileInputStream fileInputStream=new FileInputStream(path);
          // its a cvlass that know how to read and write  data to the excel  file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet1=xssfWorkbook.getSheet("Sheet1");
        //as we are interesting in the row 1we pass 1 inside the get row method rows and columns
        //are indexed based on just like array
        Row row= sheet1.getRow(1);
        Cell cell=row.getCell(1);
        System.out.println(cell);


    }
}
