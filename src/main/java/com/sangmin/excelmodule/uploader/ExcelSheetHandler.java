package com.sangmin.excelmodule.uploader;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler.SheetContentsHandler;
import org.apache.poi.xssf.usermodel.XSSFComment;

public class ExcelSheetHandler implements SheetContentsHandler {

    @Override
    public void startRow(int rowNum) {

    }

    @Override
    public void endRow(int rowNum) {

    }

    @Override
    public void cell(String cellReference, String formattedValue, XSSFComment comment) {

    }
}
