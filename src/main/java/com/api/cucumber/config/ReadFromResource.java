package com.api.cucumber.config;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;

public class ReadFromResource {
	
	public String getFileFromResource(String fileName) {
		File aFile = getFileURL(fileName);
		try {
			return FileUtils.readFileToString(aFile, Charsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";	
	}
	
	private File getFileURL(String fileName) {
		URL fileLocation = getClass().getClassLoader().getResource(fileName);
		if(fileLocation == null) {
			throw new RuntimeException(String.format(" File %s not found in src/main/resource ", fileLocation));
		}
		return new File(fileLocation.getPath());
	}
	
}
