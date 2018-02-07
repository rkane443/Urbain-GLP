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
	
	
	public Route(){}
	
	public void down(int y) {
		y++;
		
	}
	
	public void up(int y) {
		y--;
	}
		
	public void left(int x) {
		x--;
	}
	
	public void right(int x) {
		x++;
	}
	
	public void trip(String[] options,ArrayList<Point> pt,Particulars character) {
		
		int i;
		int x, y;
		x=character.getX();
		y=character.getY();
		
		for (i=0; i < options.length; i++) {
			String argument= options[i];
			
			  Point waypoint=pt.get(i);
			  Point end =pt.get(i+1);
			  int wx = waypoint.getX();
			  int wy = waypoint.getY();
			  int ex = end.getX();  
			  int ey = end.getY();
			  
			  
			// si on met L déplacement à gauche
			if (argument.compareToIgnoreCase("L") == 0 ){
				  
				while (wx != ex ) {
				left(x);	
				}
				character.setX(x);
			  }
			
			// si on met L déplacement à droite
			else if (argument.compareToIgnoreCase("R") == 0) {
				while (wx != ex ) {
				right(x);	
				}
				character.setX(x);
			  }
			
			// si on met L déplacement en haut
			else if (argument.compareToIgnoreCase("U") == 0) {
				while (wy != ey ) {
				up(y);	
				}
				character.setY(y);
			  }
			
			// si on met D déplacement en bas
			else if (argument.compareToIgnoreCase("D") == 0) {
					while (wy != ey ) {
					down(y);	
					}
					character.setY(y);
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
