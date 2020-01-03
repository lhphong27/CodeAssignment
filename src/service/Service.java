/**
 * 
 */
package service;

import main.Response;

/**
 * @author Phong
 *
 */
public interface Service {
	public Response add(Object animal);
//	public Response delete(int id);
//	public Response get(int id);
	public Object[] getAll(); 
}
