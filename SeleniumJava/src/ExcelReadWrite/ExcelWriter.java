package ExcelReadWrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Shuvo\\Desktop\\testdata.xlsx";

        try (Workbook workbook = new XSSFWorkbook()) {
            // Create a sheet in the workbook
            Sheet sheet1 = workbook.createSheet("Data");
            
            Sheet sheet2 = workbook.createSheet("Sheet4");

            // Writing data to cells
            for (int r = 1; r <= 5; r++) {
                Row row = sheet1.createRow(r - 1);
                for (int c = 1; c <= 3; c++) {
                    Cell cell = row.createCell(c - 1);
                    cell.setCellValue("Welcome");
                }
            }

            // To store multiple data into rows and columns
            Object[][] data = {
                    {"Emp Id", "Emp Name", "Designation"},
                    {1, "XYZ", "Manager"},
                    {2, "ABC", "Consultant"}
            };

            for (int i = 0; i < data.length; i++) {
                Row row = sheet2.createRow(i + 5); // Starting from the 6th row
                for (int j = 0; j < data[i].length; j++) {
                    Cell cell = row.createCell(j);
                    setCellValue(cell, data[i][j]);
                }
            }

            // Save the workbook to the specified file path
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }

            System.out.println("Excel file created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void setCellValue(Cell cell, Object value) {
        if (value instanceof String) {
            cell.setCellValue((String) value);
        } else if (value instanceof Number) {
            cell.setCellValue(((Number) value).doubleValue());
        }
    }
}
