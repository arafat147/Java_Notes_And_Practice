package oopExcelFileReadAndWrite;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {


    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        Object studentData [][] = {
                {"StudentName","ID"},
                {"James", "101"},
                {"Tom", "102"},
                {"Williams", "103"}
        };
        int rows = studentData.length;
        int clm = studentData[0].length;
        for (int r=0; r<rows; r++){

            XSSFRow row = sheet.createRow(r);

            for (int c=0; c<clm; c++){

                XSSFCell cell = row.createCell(c);
                Object value = studentData[r][c];
                if(value instanceof String){
                    cell.setCellValue((String)value);
                if(value instanceof Integer)
                    cell.setCellValue((Integer)value);
                if (value instanceof Boolean)
                    cell.setCellValue((Boolean)value);
                }

            }

        }
        String filePath = ".\\ExtLibrary\\studentInfo.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);

        outputStream.close();
        System.out.println("Excel file have been created successfully");


    }
}
