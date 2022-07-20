package com.api.cucumber.excel.transform;

import java.util.Locale;
import java.util.Map;

import com.api.cucumber.readexcel.ExcelModel;
import com.api.cucumber.readexcel.ExcelReader;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

public class ExcelDataTableConfigurator implements TypeRegistryConfigurer {

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}

	@Override
	public void configureTypeRegistry(TypeRegistry typeRegistry) {
		TableEntryTransformer<ExcelModel> transformer = new TableEntryTransformer<ExcelModel>() {

			@Override
			public ExcelModel transform(Map<String, String> entry) throws Throwable {
				ExcelReader reader = new ExcelReader.ExcelReaderBuilder().setFileLocation(entry.get("FileLocation"))
						.setSheet(entry.get("SheetName")).build();
				return new ExcelModel(reader.getSheetData());
			}

		};

		DataTableType tableType = new DataTableType(ExcelModel.class, transformer);
		typeRegistry.defineDataTableType(tableType);

	}

}
