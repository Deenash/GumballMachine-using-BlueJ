
/**
 * Write a description of class SoldOutState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class SoldOutState implements State {
    GumballMachine gbMac;
 
    public SoldOutState(GumballMachine gbMac) {
        this.gbMac = gbMac;
    }
 
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
 
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
	
	public void insertDime(){
		System.out.println("You can't insert a dime, the machine is sold out");
	}
	
	public void insertNickel(){
		System.out.println("You can't insert a nickel, the machine is sold out");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
 
	public String toString() {
		return "sold out";
	}
}
