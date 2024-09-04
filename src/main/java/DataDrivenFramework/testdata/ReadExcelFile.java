//package DataDrivenFramework.testdata;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//
//public class ReadExcelFile {
//   private Workbook workbook;
//   private Sheet sheet;
//
//    public ReadExcelFile(String excelPath) {
//        try{
//            File src = new File (excelPath);
//            FileInputStream fis = new FileInputStream(src);
//            workbook = new XSSFWorkbook(fis);
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public Object[][] getData(String sheetName) {
//        sheet = workbook.getSheet(sheetName); // Get the specified sheet
//        int rowCount = sheet.getLastRowNum();
//        int colCount = sheet.getRow(0).getLastCellNum();
//        Object[][] data = new Object[rowCount][colCount];
//
//        for (int i = 1; i <= rowCount; i++) {
//            Row row = sheet.getRow(i);
//            for (int j = 0; j < colCount; j++) {
//                Cell cell = row.getCell(j);
//                data[i - 1][j] = cell.getStringCellValue();
//            }
//        }
//        return data;
//    }
//    public void close() {
//        try {
//            workbook.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//}
