package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static void readExcel() {

        try {

            FileInputStream file =
                    new FileInputStream(
                            "testdata.xlsx");

            XSSFWorkbook workbook =
                    new XSSFWorkbook(file);

            XSSFSheet sheet =
                    workbook.getSheetAt(0);

            String data =
                    sheet.getRow(1)
                            .getCell(0)
                            .getStringCellValue();

            System.out.println(data);

            workbook.close();

        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }
}