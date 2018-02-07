package processing;
public class RouteAlreadyExistsException extends Exception {
	public RouteAlreadyExistsException(Route path) {
		super("Route exists : " + path.toString());
	}
}