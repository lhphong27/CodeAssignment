/**
 * 
 */
package animals;

import utils.Constant;

/**
 * @author Phong
 *
 */
public class Fish extends Animal {

	private String color;
	private String bodyType;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the bodyType
	 */
	public String getBodyType() {
		return bodyType;
	}

	/**
	 * @param bodyType the bodyType to set
	 */
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	public void swim() {
		System.out.println(Constant.SWIMS);
	}
}
