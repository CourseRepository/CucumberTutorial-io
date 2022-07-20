package com.api.cucumber.config;

import org.junit.Test;

public class TestResourceReader {
	
	@Test
	public void testReader() {
		ReadFromResource reader = new ReadFromResource();
		String a = reader.getFileFromResource("data/TestData.json");
		System.out.println(a);
	}

}
