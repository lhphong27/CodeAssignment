/**
 * 
 */
package animals;

import utils.Constant;

/**
 * @author Phong
 *
 */
public class ClownFish extends Fish{
	public ClownFish(){
		super.setColor(Constant.COLOUR_ORANGE);
		super.setBodyType(Constant.BODYTYPE_SMALL);
	}
	
	public void makeJoke() {
		System.out.println(Constant.MAKE_JOKE);
	}
}
