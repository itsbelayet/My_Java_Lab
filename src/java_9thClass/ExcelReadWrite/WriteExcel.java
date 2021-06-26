package java_9thClass.ExcelReadWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    //Dynamic Relative path
    public static final String F_PATH="../Home_Test/DataTest/MyTable.xlsx";

    public static void main(String[] args) {
        Object[][] familyTable = {
                {"Sl", "Name", "Age", "Salary"},
                {"01", "Miru", "57 ", "8000  "},
                {"02", "Hiru", "50 ", "9000  "},
                {"03", "Moni", "60 ", "7500  "},
                {"04", "Reka", "58 ", "9500  "}
        };
        WriteFile(F_PATH,"MySheet",familyTable);
    }
    public static void WriteFile(String filePath, String sheetName, Object[][] data){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);

        int rowNum=0;
        System.out.println("Excel File Created");

        for (Object[] std: data) {
            Row row=sheet.createRow(rowNum++);
            int colNum=0;
            for (Object field:std) {
                Cell cell=row.createCell(colNum++);

                if (field instanceof String){
                    cell.setCellValue((String)field);
                }else if(field instanceof Integer){
                    cell.setCellValue((Integer)field);
                }
            }
        }
        try{
            FileOutputStream out = new FileOutputStream(filePath);
            workbook.write(out);
            workbook.close();
        }catch (FileNotFoundException fn){
            System.out.println("File not Found Exception");
        }catch (IOException io){
            System.out.println("File Write Successfully");
        }
    }
}
