package org.selenium.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelUtility {
public static FileInputStream file;
public static XSSFWorkbook wb;
public static XSSFSheet sh;

  /* public static String readStringData(int i,int j,String sheet) throws IOException {
        file=new FileInputStream("C:\\Users\\Chinnu Lalu\\IdeaProjects\\seleniumbasics\\src\\main\\resources\\TestData.xlsx");
        wb=new XSSFWorkbook(file);
        sh= wb.getSheet(sheet);
        Row row=sh.getRow(i);
        Cell cell= row.getCell(j);
        return cell.getStringCellValue();
    }*/
    public static ArrayList<String>readData(String file_path,String sheet) throws IOException {
        file=new FileInputStream(file_path);
        wb=new XSSFWorkbook(file);
        sh= wb.getSheet(sheet);
        ArrayList<String>excelRows=new ArrayList<>();
        int rowCount=sh.getLastRowNum()- sh.getFirstRowNum();
        for(int i=0;i<=rowCount;i++){
            Row row=sh.getRow(i);
            int cellCount = row.getLastCellNum();
            for(int j=0;j<cellCount;j++){
                excelRows.add(row.getCell(j).getStringCellValue());
            }
        }
        return excelRows;
    }

    public static void main(String[] args) throws IOException {
        //System.out.println(ExcelUtility.readStringData(1,0,"Login_Data"));
        System.out.println(ExcelUtility.readData("C:\\Users\\Chinnu Lalu\\IdeaProjects\\seleniumbasics\\src\\main\\resources\\TestData.xlsx","Login_Data"));

    }
}
