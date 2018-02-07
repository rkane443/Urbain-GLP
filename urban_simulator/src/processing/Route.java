package processing;
import java.util.ArrayList;
import data.Particulars;

public class Route {
	ArrayList<Point> pt;
	String name;
	
	
	public Route(ArrayList<Point> pt){
	pt=new ArrayList();
	
	}
	
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
			
			for (int j = 0; j< pt.size();j++) {
			  Point waypoint=pt.get(j);
			  Point end =pt.get(j+1);
			
			  if (argument.compareToIgnoreCase("L") == 0 ){
			
				int wx = waypoint.getX();
				int ex = end.getX();
				
				while (wx != ex ) {
				left(x);	
				}
				character.setX(x);
			
			  }
			}
		}
		
	}
			
}