package processing;
import java.util.ArrayList;
import data.Particulars;

/**
 * 
 * @author François-Laurent
 *
 */

public class Route {
	private String name;
	private ArrayList<Point> journey =new ArrayList<Point>();
	String  move;
	
	public Route(String name, String paths,ArrayList<Point> pt){
		this.name=name;
		this.move=paths;
		this.journey=pt;
		
	}
	
	public void trip(Particulars character) {
		
		int i;
		int x, y;
		x =character.getX();
		y =character.getY();
		
		String [] options;
		
		options= move.split("-");
		int lg  = options.length;
		
		
		for (i=0; i < lg ; i++) {
			String argument= options[i];
			
			  Point waypoint=journey.get(i);
			  Point end =journey.get(i+1);
			  
			  int wx = waypoint.getX();
			  int wy = waypoint.getY();
			  
			  int ex = end.getX();  
			  int ey = end.getY();
			  
			  
			  System.out.println("Depart");
			  if (argument.compareToIgnoreCase("L") == 0 ){
				  int x1;
				  System.out.println("L");
				for(x1=wx ; x1 <ex ; x1++ ) {
					character.setX(x-1);
				}
				
		
			  }
			
			  else if (argument.compareToIgnoreCase("R") == 0) {
				  int x2;
				  System.out.println("R");
				  for(x2=wx ; x2 <ex ; x2++ ){
				character.setX(x+1);
					}
				}
			  
			  else if (argument.compareToIgnoreCase("U") == 0) {
				   int y1;
				   System.out.println("U");
				   for(y1=wy ; y1 <ey ; y1++ ) {
					character.setY(y-1);		
					}
				}
			  
			  else if (argument.compareToIgnoreCase("D") == 0) {
				  int y2;
				  System.out.println("D");
				  for(y2=wy ; y2 <ey ; y2++ ) {	
					character.setY(y+1);
					}
			  	}
			  else {
				  
				  System.err.println("Lack of information");
			  
			  }
			  
			  
		}
		
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}


	
}
