package com.ui.utilities;

import com.constants.Environment;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	public static String readProperty(Environment env,String propertyName) {
	
	File file=new File(System.getProperty("user.dir")+File.separator+"config"+File.separator + env + ".properties");
	
	FileReader reader = null;
	Properties prop=new Properties();
	try {
		reader = new FileReader(file);
		prop.load(reader);
	} 
	catch (IOException e) {
		
		e.printStackTrace();
	}
	return prop.getProperty(propertyName.toUpperCase());
}}
