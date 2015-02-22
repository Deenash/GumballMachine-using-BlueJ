
/**
 * Write a description of class HasCoinState here.
 * 
 * @author Deenash 
 * @version 20-Feb-2015
 */




import java.util.Random;

public class HasCoinState implements State {
	GumballMachine gbMac;
 
	public HasCoinState(GumballMachine gbMac) {
		this.gbMac = gbMac;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
	
	public void insertDime(){
		System.out.println("You can't insert another dime");
	}
	
	public void insertNickel(){
		System.out.println("You can't insert another nickel");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gbMac.setMoney_count(gbMac.getMoney_count()-25);
		gbMac.setState(gbMac.getNoCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gbMac.gumballInSlot=true;
		gbMac.setState(gbMac.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}

