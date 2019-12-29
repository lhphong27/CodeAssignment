/**
 * 
 */
package utils;

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
}
