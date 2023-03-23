package class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class task1 {
    public static void main(String[] args) throws IOException {
        String path="Files/test1.properties";
      FileOutputStream fileInputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Model","Raju ban gya gentle man");
       properties.store(fileInputStream,"A new songs is created  ");


    }
}
