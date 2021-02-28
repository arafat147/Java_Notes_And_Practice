package oopExcelFileReadAndWrite;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWrite {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();//1. create a workbook
        XSSFSheet sheet = workbook.createSheet("Sheet2");//2. using workbook create a sheet
        Object studentData [] [] = {     {"Student ID", "Name"},//3. create a 2D array to provide what we want ot write in excel.
                                         {"101","Alex" },
                                         {"102","Blex" },
                                         {"103","Clex" },
                                    };
        int rows = studentData.length;//4. getting initial values for rows and columns to create loops
        int columns = studentData[0].length;
        for (int r=0; r<rows; r++){//5. this loop is to create the rows in the sheet.
            XSSFRow row = sheet.createRow(r);
            for (int c=0; c<columns; c++){//6. create a cell for the row
                XSSFCell cell = row.createCell(c);
                Object value = studentData [r] [c];//7. now that the row and cell is created, we have to insert the data. first we have to store the values
                if (value instanceof String)
                    cell.setCellValue((String) value);//8. we use the cell object to set the value inside
                if (value instanceof Integer)
                    cell.setCellValue((Integer) value);
                if (value instanceof Boolean)
                    cell.setCellValue((Boolean) value);
            }

        }

        String path = ".\\ExtLibrary\\studentInfo.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        outputStream.close();

        System.out.println("File written successfully");

    }

}
