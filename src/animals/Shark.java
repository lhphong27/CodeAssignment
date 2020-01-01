/**
 * 
 */
package animals;

import utils.Constant;

/**
 * @author Phong
 *
 */
public class Shark extends Fish{
	public Shark() {
		super.setColor(Constant.COLOUR_GREY);
		super.setBodyType(Constant.BODYTYPE_LARGE);
	}
	
	public void eatOtherFish() {
		System.out.println(Constant.EAT_OTHER_FISH);
	}
}
