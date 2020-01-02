/**
 * 
 */
package utils;

import java.lang.reflect.Method;
import java.util.List;


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
}
