/**
 * 
 */
package animals;

import utils.Constant;

/**
 * @author Phong
 *
 */
public class Parrot extends Bird {

	private static String word;

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	@SuppressWarnings("static-access")
	public void setWord(String word) {
		this.word = word;
	}

	public static void say() {
		System.out.println(word);
	}
	
	public static void fly() {
		System.out.println(Constant.FLY);
	}
}
