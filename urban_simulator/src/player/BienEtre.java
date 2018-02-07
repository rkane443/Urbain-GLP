package player;

public class BienEtre 
{
	private int sante;
	private int humeur;
	private int energie;
	private int hygiene;
	
	public BienEtre(int sante, int humeur, int energie, int hygiene) 
	{
		super();
		this.sante = sante;
		this.humeur = humeur;
		this.energie = energie;
		this.hygiene = hygiene;
	}

	public int getSante() 
	{
		return sante;
	}

	public void setSante(int sante) 
	{
		this.sante = sante;
	}

	public int getHumeur() 
	{
		return humeur;
	}

	public void setHumeur(int humeur) 
	{
		this.humeur = humeur;
	}

	public int getEnergie() 
	{
		return energie;
	}

	public void setEnergie(int energie) 
	{
		this.energie = energie;
	}

	public int getHygiene() 
	{
		return hygiene;
	}

	public void setHygiene(int hygiene) 
	{
		this.hygiene = hygiene;
	}
	
	
}
