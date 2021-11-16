package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utilities {
	
	public static Properties prop;
	
	public static Properties readProp(String filePath) throws IOException {
		
		FileReader reader = new FileReader(System.getProperty("user.dir") + filePath);
		prop = new Properties();
		prop.load(reader);
		reader.close();
		return prop;
		
	}

}
