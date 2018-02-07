package processing;
import data.Particulars;
import data.Place;

public class Deplacement {
	
	private Point start;
	private Point end;
	
	
	public Deplacement(Particulars perso, Place place) {
		int x, y;
		int a, b;
		
		x=perso.getX();
		y=perso.getY();
		
		start.setX(x);
		start.setY(y);
		
		a=place.getX();
		b=place.getY();
		
		end.setX(a);
		end.setX(b);
		
		
		
	}
	
	public double longueur() {
		int x1 = start.getX();
		int x2 = end.getX();
		
		int y1 = start.getY();
		int y2 = end.getY();
		
		return Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2), 2));
	}
	
	public void parcours(Point a,Point b) {
		
		int xd = this.start.getX();
		int yd = this.start.getY();
		
		int xa = this.end.getX();
		int ya = this.end.getY();
		 
		int xp = xd+1,yp=yd+1;
		/**
		 * 0=mur
		 * 1=route
		 * 2=entree
		 * 3=batiment
		*/
		while ((xd == xa) && (yd ==ya)) {	
			
		switch(xp) {
		case 0: 
		
		case 1: xd++;
		start.setX(xd);
		
		case 2:
		start.setX(xd);
		
		case 3:
		
		}
		
		switch(yp) {
		case 0: 
			
		case 1: yd++;
		start.setY(yd);
		
		case 2:yd++;
		start.setY(yd);
		
		case 3:
			
			
		}
		
		
		}
		
		
	}
	
	
	
	
	

}
