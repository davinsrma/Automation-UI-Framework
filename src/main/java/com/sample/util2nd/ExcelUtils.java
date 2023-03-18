package com.sample.util2nd;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

//    constructor to load the object of this class
    public ExcelUtils(String excelPath, String sheetName){
        try {
            workbook=new XSSFWorkbook(excelPath);
            sheet=workbook.getSheet(sheetName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    Method to get row count
    public int getRowCount(){
        int rowCount = 0;
        try {
            rowCount = sheet.getPhysicalNumberOfRows();
//            System.out.println("Number of physical rows are : " + rowCount);
        }catch (Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return rowCount;
    }

//    Method to get column count
    public int getColCount(){
        int colCount=0;
        try {
            colCount = sheet.getRow(0).getPhysicalNumberOfCells();
//            System.out.println("Number of physical columns are : " + colCount);
        }catch (Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return colCount;
    }

//    Method to get cell string data
    public String getCellDataString(int rowNum, int colNum){
        String cellData=null;
        try {
            cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//            System.out.println(cellData);
        }catch (Exception e){
        System.out.println(e.getCause());
        System.out.println(e.getMessage());
        e.printStackTrace();
        }
        return cellData;
    }

//    method to get cell numeric data
    public void getCellDataNumeber(int rowNum, int colNum){
        try{
            double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
//            System.out.println(cellData);


        }catch (Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
