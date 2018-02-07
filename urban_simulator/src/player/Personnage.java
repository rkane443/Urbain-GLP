package player;

public class Personnage 
{
	private double stats;
	private String nom;
	private Comportement comportement;
	
	public Personnage(double stats, String nom, Comportement comportement) {
		super();
		this.stats = stats;
		this.nom = nom;
		this.comportement = comportement;
	}
	
}
