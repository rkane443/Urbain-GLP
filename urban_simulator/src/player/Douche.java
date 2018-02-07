package player;

public class Douche implements ChangementBienEtre
{
    private BienEtre bg;
    
	public Douche(BienEtre bg) 
	{
		super();
		this.bg = bg;
	}

	@Override
	public void ameliorationSante() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decheanceSante() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ameliorationHygiene() {
		bg.setHygiene(bg.getHygiene()+10);
		
	}

	@Override
	public void decheanceHygiene() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ameliorationEnergie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decheanceEnergie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ameliorationHumeur() 
	{
		bg.setHumeur(bg.getHumeur()+10);
	}

	@Override
	public void decheanceHumeur() {
		// TODO Auto-generated method stub
		
	}

}
