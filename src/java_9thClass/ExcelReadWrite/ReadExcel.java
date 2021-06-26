package java_9thClass.ExcelReadWrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {
    public static final String FILE_NAME=System.getProperty("user.dir")+"/DataTest/MyTable.xlsx";

    public static void main(String[] args) {
        ReadExcel.ReadFile(FILE_NAME,2);
    }

    public static void ReadFile(String filename,int sheetNumber){
        try{
            FileInputStream inputStream = new FileInputStream(FILE_NAME);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);

            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()){
                Row currentRow = rowIterator.next();

                Iterator<Cell> cellIterator =currentRow.iterator();
                while (cellIterator.hasNext()){
                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellType()== CellType.STRING){
                        System.out.print(currentCell.getStringCellValue()+"   ");
                    }else if(currentCell.getCellType()==CellType.NUMERIC){
                        System.out.print(currentCell.getNumericCellValue()+"  ");
                    }
                }
                System.out.println();
            }
        }catch (FileNotFoundException fn){
            System.out.println("Excel File not Found");
        }catch (IOException io){
            System.out.println("File read successfully");
        }
    }
}
