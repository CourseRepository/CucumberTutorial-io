package com.api.cucumber.transform;

import java.util.Locale;
import java.util.Map;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import io.cucumber.datatable.TableTransformer;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

	@Override
	public void configureTypeRegistry(TypeRegistry registry) {
		DataTableType type = new DataTableType(User.class, new TableEntryTransformer<User>() {

			@Override
			public User transform(Map<String, String> entry) throws Throwable {
				System.out.println("Hello");
				return new User(entry.get("username"), entry.get("password"));
			}
		});
		registry.defineDataTableType(type);
		
	}

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}

}
