package com.api.cucumber.stepdfn;

import com.api.cucumber.readexcel.ExcelModel;

import io.cucumber.java.en.When;

public class ExcelDataWithRegistryStepDfn {
	
	@When("User login with the following username and password with data in excel sheet")
	public void user_login_with_the_following_username_and_password_with_data_in_excel_sheet(io.cucumber.datatable.DataTable dataTable) {
	   ExcelModel excelData = dataTable.convert(ExcelModel.class, false);
	   System.out.println(excelData.getExcelData());
	}


}
