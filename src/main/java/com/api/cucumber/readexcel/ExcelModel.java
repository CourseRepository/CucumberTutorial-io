package com.api.cucumber.readexcel;

import java.util.List;

public class ExcelModel {
	
	private List<List<String>> excelData;
	
	public ExcelModel(List<List<String>> excelData) {
		this.excelData = excelData;
	}
	
	public List<List<String>> getExcelData() {
		return excelData;
	}

}
