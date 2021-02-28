package oopExcelFileReadAndWrite;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

    public static void main(String[] args) throws IOException {
        //1. store file path in a string:
        String filePath = "C:\\Users\\arafa\\eclipse-workspace\\Java_Notes_And_Practice\\src\\oopExcelFileReadAndWrite\\ExcelFileRead.xlsx";
        //2. pass it through the inputstream to split the data into byte codes:
        FileInputStream inputStream = new FileInputStream(filePath);
        //3. use workbook object to pass the inputstream. it works as a buffered reader.
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        //4. from workbook we get the sheet of our excel file:
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        //5. from the sheet now we need a for loop to read all the data using for loop. and so we need the number of rows and columns
        //   for our loop conditions:
        int rows = sheet.getLastRowNum(); // or sheet.getPhysicalNumberOfRows();
        int columns = sheet.getRow(0).getLastCellNum();// we need to pass one row number and then we can get the number of cells that row have which means all the row numbers will have the same columns or cells.
        //6. we need nested for loop, one for the row and inside that row we need the inner loop to get the cells:
        for (int r = 0; r < rows; r++) {

            XSSFRow row = sheet.getRow(r);

            for (int c = 0; c < columns; c++) {
                XSSFCell cell = row.getCell(c);
                switch(cell.getCellType())
                {
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                }
                System.out.print("  ||  ");
            }
            System.out.println();
        }


    }


}
