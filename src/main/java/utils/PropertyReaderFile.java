package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReaderFile {
	static Properties prop = new Properties();
	static {
		try {
			File file=new File("C:\\Users\\dhanashree.parit\\eclipse-workspace\\GitHub\\src\\main\\resources\\TestData.properties");
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static String getValue(String key) {
		String value = prop.getProperty(key);
		return value;
	}

}

