package com.autodisk.genriclibrary;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author Darshan M R
 *
 */
public class FileLib {

	String filepath = "./TestData/commonData.properties";
	
	public String getDataFromPropertie(String key) throws Throwable
	{
		FileInputStream fil = new FileInputStream(filepath);
		
	Properties pob = new Properties();
	pob.load(fil);
	
				String value = pob.getProperty(key);
				
				return value;
		
		
	}
	
	
	
}
