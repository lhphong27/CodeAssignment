/**
 * 
 */
package utils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Properties;


/**
 * @author Phong
 *
 */
public class Utils {
	
	/**
	 * This method is used for testing the expectation string when using method System.out.println() 
	 * @param String expectedString
	 * @return String expectedString + endline character
	 * */
	public static String constructExpectedValue(String expectedString) {
		return new StringBuilder(expectedString).append(System.getProperty("line.separator")).toString();
	}
	
	/**
	 * Count the number of animal by a specific ability
	 * @param String ability
	 * @param Object[] arrayClass
	 * @return int count (Number of animal that match the ability)
	 * 
	 * */
	public static int countAninmalByAbility(String ability, Object[] arrayClass) {
		int count = 0;
		for(int i = 0; i < arrayClass.length; i++) {
			Object object = arrayClass[i];
			Method[] methods = object.getClass().getMethods();
			for(int j = 0; j < methods.length; j++) {
				if(ability.equals(methods[j].getName())) {
					count++;
				}
			}
		}
		return count;
	}
	
	/**
	 * Count the number of animal by a specific ability
	 * @param String ability
	 * @param List<Object> listOfClass
	 * @return int count (Number of animal that match the ability)
	 * 
	 * */
	public static int countAninmalByAbility(String ability, List<Object> listOfClass) {
		int count = 0;
		boolean capable = false;
		for(int i = 0; i < listOfClass.size(); i++) {
			Object object = listOfClass.get(i);
			Method[] methods = object.getClass().getMethods();
			for( int j = 0; j < methods.length; j++) {
				if(ability.equals(methods[j].getName())){
					count++;
					capable = true;
				}
			}
			if(capable) {
				System.out.println(object.getClass().getName() + " can " + ability);
				capable = false;
			}
		}
		return count;
	}
	
	public String getMessageByLanguage(String messageKey) {
		String result = "";
		try {
			//construct properties file name based on locale
			StringBuilder propertiesFileName =  new StringBuilder("message_");
			//fallback to default value
			if("en_US".equals(Locale.getDefault().toString())) {
				Locale locale = new Locale("en");
				Locale.setDefault(locale);
			}
			propertiesFileName.append(Locale.getDefault().toString());
			propertiesFileName.append(".properties");
			InputStream input = getClass().getClassLoader().getResourceAsStream(propertiesFileName.toString());
			Properties properties = new Properties();
			properties.load(input);
			result = properties.get(messageKey).toString();
			
		}catch(IOException ex) {
			System.out.println("Error: " + ex);
		}
		return result;
	}
}
