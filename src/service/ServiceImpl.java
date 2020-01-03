/**
 * 
 */
package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import animals.Animal;
import animals.Bird;
import animals.ClownFish;
import animals.Shark;
import main.Response;

/**
 * @author Phong
 *
 */
@Path("/animal")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class ServiceImpl implements Service{
	
	//TODO we will store the animal in json or database
	private Map<Integer,Object> animals = new HashMap<Integer,Object>();

	@Override
	@POST
	@Path("/add")
	// init the data
	public Response add(Object animal) {
		Random random = new Random();
		int randomId = random.nextInt(10000);
		animals.put(randomId, animal);
		return null;
	}
	

	@Override
	@GET
	@Path("/getAll")
	public Object[] getAll() {
		Set<Integer> ids = animals.keySet();
		Object[] animal = new Animal[ids.size()];
		int i=0;
		for(Integer id : ids){
			animal[i] = animals.get(id);
			i++;
		}
		return animal;
	}



}
