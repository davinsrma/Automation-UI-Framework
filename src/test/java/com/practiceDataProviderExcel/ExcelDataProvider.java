package com.practiceDataProviderExcel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

    @DataProvider(name = "testData")
    public static Object[][] testData() throws IOException {
        // Specify the path of the Excel file
        String filePath = "./src/test/resources/userDataInformation.xlsx";
        // Specify the sheet name
        String sheetName = "data";

        // Create a FileInputStream object to read the Excel file
        FileInputStream fis = new FileInputStream(filePath);
        // Create a Workbook object to access the Excel file
        Workbook workbook = WorkbookFactory.create(fis);
        // Create a Sheet object to access the sheet
        Sheet sheet = workbook.getSheet(sheetName);

        // Get the number of rows and columns in the sheet
        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();

        // Create a two-dimensional object array to hold the data
        Object[][] data = new Object[rowCount][colCount];

        // Loop through each row in the sheet and retrieve the data
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i+1);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                data[i][j] = cell.toString();
            }
        }

        // Close the FileInputStream and Workbook objects
        fis.close();
        workbook.close();

        return data;
    }
}
