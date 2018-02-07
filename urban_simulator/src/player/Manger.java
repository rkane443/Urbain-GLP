package player;

public class Manger implements ChangementBienEtre
{
    private BienEtre bg;
    
	public Manger(BienEtre bg) 
	{
		super();
		this.bg = bg;
	}

	public void ameliorationSante() 
	{
		bg.setSante(bg.getSante()+10);
		
	}
	
	public void ameliorationEnergie() 
	{
		bg.setEnergie(bg.getEnergie()+5);
		
	}

	public void decheanceSante() 
	{
		
	}

	public void ameliorationHygiene() 
	{
		
	}

	public void decheanceHygiene() 
	{
		
	}



	public void decheanceEnergie() 
	{
		
	}

	public void ameliorationHumeur() 
	{
		// TODO Auto-generated method stub
		
	}

	public void decheanceHumeur() {
		// TODO Auto-generated method stub
		
	}

}
