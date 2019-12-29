/**
 * 
 */
package animals;

/**
 * @author Phong
 *
 */
public class Parrot extends Animal {

	private String word;

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public void say() {
		System.out.println(word);
	}
}
