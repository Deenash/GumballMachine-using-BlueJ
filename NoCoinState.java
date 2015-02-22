
/**
 * Write a description of class NoCoinState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class NoCoinState implements State {
    GumballMachine gbMac;
 
    public NoCoinState(GumballMachine gbMac) {
        this.gbMac = gbMac;
    }
 
	public void insertQuarter() {
		
		System.out.println("You inserted a quarter");
		gbMac.setMoney_count(gbMac.getMoney_count()+25);
		System.out.println("The total money inserted: "+gbMac.getMoney_count()+ " cents");
		if(gbMac.getMoney_count()>=50)
		{
			gbMac.setState(gbMac.getHasCoinState());
		}
		else
		{
			System.out.println("You have to insert "+ (50-gbMac.getMoney_count())+ " more cents to get a Gumball.");
		}	
	}
	
	
	public void insertDime(){
		System.out.println("You inserted a dime");
		gbMac.setMoney_count(gbMac.getMoney_count()+10);
		System.out.println("The total money inserted: "+gbMac.getMoney_count()+ " cents");
		if(gbMac.getMoney_count()>=50)
		{
			gbMac.setState(gbMac.getHasCoinState());
		}
		else
		{
			System.out.println("You have to insert "+ (50-gbMac.getMoney_count())+ " more cents to get a Gumball.");
		}	
	}
	
	public void insertNickel(){
		System.out.println("You inserted a Nickel.");
		gbMac.setMoney_count(gbMac.getMoney_count()+5);
		System.out.println("The total money inserted: "+gbMac.getMoney_count()+ " cents");
		if(gbMac.getMoney_count()>=50)
		{
			gbMac.setState(gbMac.getHasCoinState());
		}
		else
		{
			System.out.println("You have to insert "+ (50-gbMac.getMoney_count())+ " more cents to get a Gumball.");
		}
	}
 
	public void ejectQuarter() {
		if(gbMac.getMoney_count()<25)
			System.out.println("You haven't inserted a quarter / Not sufficient money is inserted.");
		else
		{
			System.out.println("You can take back your Quarter.");
			gbMac.setMoney_count(gbMac.getMoney_count()-25);
			System.out.println("The total money present: "+gbMac.getMoney_count()+ " cents");
		}
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no enough money");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for two quarters";
	}
}
