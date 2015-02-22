
/**
 * Write a description of class SoldState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoldState implements State {
 
    GumballMachine gbMac;
 
    public SoldState(GumballMachine gbMac) {
        this.gbMac = gbMac;
    }
       
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
	
	public void insertDime(){
		System.out.println("Please wait, we're already giving you a gumball");
	}
	
	public void insertNickel(){
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {

		gbMac.releaseBall();
		//gbMac.takeGumballFromSlot();
		gbMac.setMoney_count(gbMac.getMoney_count()-50);
		gbMac.releaseMoney();
		if (gbMac.getCount() > 0) {
			gbMac.setState(gbMac.getNoCoinState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gbMac.setState(gbMac.getSoldOutState());
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


