/**
 * 
 */
package main;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Phong
 *
 */
@XmlRootElement
public class Response {
	private boolean state;
	private String message;
	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
