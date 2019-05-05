package com.api.cucumber.transform;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import io.cucumber.datatable.TableRowTransformer;

public class DataTableConfigurator implements TypeRegistryConfigurer {

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}

	@Override
	public void configureTypeRegistry(TypeRegistry typeRegistry) {
		TableEntryTransformer<User> transformer = new TableEntryTransformer<User>() {
			
			@Override
			public User transform(Map<String, String> entry) throws Throwable {
				return new User(entry.get("username"), entry.get("password"));
			}
		};
		
		TableRowTransformer<UserDetails> rowTransformer = new TableRowTransformer<UserDetails>() {

			@Override
			public UserDetails transform(List<String> row) throws Throwable {
				return new UserDetails(row.get(0),row.get(1),row.get(2));
			}
		};
		
		DataTableType tableType = new DataTableType(User.class, transformer);
		DataTableType rowType = new DataTableType(UserDetails.class, rowTransformer);
		typeRegistry.defineDataTableType(tableType);
		typeRegistry.defineDataTableType(rowType);
		
	}

}
