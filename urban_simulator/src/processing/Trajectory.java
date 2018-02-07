package processing;

import java.util.ArrayList;

public class Trajectory {

	ArrayList <Route> paths =new ArrayList();
	
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
