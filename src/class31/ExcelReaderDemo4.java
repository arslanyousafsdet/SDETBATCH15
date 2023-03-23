package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo4 {
    public static void main(String[] args) throws IOException {
        //Location of file on the computer
        String path="Files/Book1.xlsx";
        //Navigating to the file
        FileInputStream fileInputStream=new FileInputStream(path);
        // its a cvlass that know how to read and write  data to the excel  file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet1=xssfWorkbook.getSheet("Sheet1");
        int numberOfRows=sheet1.getPhysicalNumberOfRows();

        //we can use var or List both will work same way
        //var excelData=new ArrayList<>();

        List<Map<String,String>> excelData=new ArrayList<>();

        for (int i= 1; i < numberOfRows; i++) {
            Row row= sheet1.getRow(i);
            LinkedHashMap rowMap1=new LinkedHashMap();
            rowMap1.put("Name",row.getCell(0));
            rowMap1.put("Age",row.getCell(1));
            rowMap1.put("City",row.getCell(2));
            rowMap1.put("Salary",row.getCell(3));
            excelData.add(rowMap1);




        }

    }
}
