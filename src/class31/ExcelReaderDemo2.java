package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {
        //Location of file on the computer
        String path="Files/Book1.xlsx";
        //Navigating to the file
        FileInputStream fileInputStream=new FileInputStream(path);
        // its a cvlass that know how to read and write  data to the excel  file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet1=xssfWorkbook.getSheet("Sheet1");
        int numberOfRows=sheet1.getPhysicalNumberOfRows();



        for (int i = 0; i < 4; i++) {
            Row row= sheet1.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
         //   System.out.println(row);
            for (int j = 0; j < 4; j++) {
                Cell cell= row.getCell(j);
                System.out.print(cell+" ");

            }
            System.out.println();

        }

    }
}
