package processing;

import java.util.ArrayList;

/**
 * 
 * @author François-Laurent
 *
 */
public class Trajectory {

	ArrayList <Route> paths =new ArrayList();
	
	// ajout de chemin
	public void add(Route path)throws RouteAlreadyExistsException {
		if (paths.contains(path)) {
			throw new RouteAlreadyExistsException(path);
		} else {
			paths.add(path);
		}
	}
	
	public boolean contains(Route path) {
		return paths.contains(path);
	}
	
	
}
