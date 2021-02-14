package com.testNG.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadExcel {

    @Test
    public void test() throws IOException {

        String dosyaYolu="src/test/resources/ULKELER.xlsx";

        //Java'da bir dosyayı açmak için bu kullanılır.
        // Parametre bölümüne açmak istediğimiz dosyanın adresi (dosya yolu,path) yazılır
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        // Workbook (excel) dosyasını okumaya başladık.
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        // 1. sayfaya gider. (index değeri 0'dan başlar.)
        Sheet sheet       = workbook.getSheetAt(0);
        // 1. satıra gidelim. (index değeri 0'dan başlar.)
        Row row           = sheet.getRow(0);
        // 1. Hücreyi alalım. (index değeri 0'dan başlar.)
        Cell ulkeler      = row.getCell(0);
        Cell baskentler   = row.getCell(1);
        Cell meshurlar    = row.getCell(2);

        System.out.println(ulkeler);
        System.out.println(baskentler);
        System.out.println(meshurlar);

        System.out.println(workbook.getSheetAt(0).getRow(7).getCell(2));
        System.out.println(workbook.getSheetAt(0).getRow(10).getCell(0));

        int satirSayisi=workbook.getSheetAt(0).getLastRowNum();

        System.out.println("Satir sayisi "+satirSayisi);

        int doluSatirSayisi=workbook.getSheetAt(0).getPhysicalNumberOfRows();
        System.out.println("Dolu satir sayisi :"+doluSatirSayisi);
        System.out.println("===================================================");
        //tum ulkeler
        int sonSatirinIndexi = workbook.getSheetAt(0).getLastRowNum(); // 10
        for(int i = 0 ; i <= sonSatirinIndexi ; i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));
        }
        System.out.println("=====================================================");
        //tum baskentler
        for(int i = 0 ; i <= sonSatirinIndexi ; i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(1));
        }
        System.out.println("==================================================");

        //bir satirinin tamamini yazdirma  son sutun index ini alma
        int sutunSayisi=workbook.getSheetAt(0).getRow(0).getLastCellNum();
        System.out.println("Son sutun sayisi "+ sutunSayisi);

        for (int i=0;i<sutunSayisi;i++){
            System.out.println(workbook.getSheetAt(0).getRow(3).getCell(i));
        }

    }
}
