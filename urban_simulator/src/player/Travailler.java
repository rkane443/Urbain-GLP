package player;

public class Travailler implements ChangementBienEtre
{
    private BienEtre bg;
    
	public Travailler(BienEtre bg) 
	{
		super();
		this.bg = bg;
	}


	@Override
	public void ameliorationSante() {
		
	}

	@Override
	public void decheanceSante() {
		bg.setSante(bg.getSante()-5);
		
	}

	@Override
	public void ameliorationHygiene() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decheanceHygiene() {
		bg.setHygiene(bg.getHygiene()+10);
		
	}

	@Override
	public void ameliorationEnergie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decheanceEnergie() {
		bg.setEnergie(bg.getEnergie()-20);
		
	}

	@Override
	public void ameliorationHumeur() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decheanceHumeur() {
		bg.setHumeur(bg.getHumeur()-20);
		
	}

}
