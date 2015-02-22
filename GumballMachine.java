
/**
 * Write a description of class GumballMachine here.
 * 
 * @author Deenash 
 * @version 20-Feb-2015
 */


public class GumballMachine implements IGumballMachine {
 
	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	int money_count=0;
	boolean gumballInSlot=false;
	
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noCoinState;
		} 
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void insertDime(){
		state.insertDime();
	}
	
	public void insertNickel(){
		state.insertNickel();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		if(this.gumballInSlot==true)
		{
			System.out.println("A gumball comes rolling out the slot...");
			if (count != 0) {
				count = count - 1;
			}
		}
		else
			System.out.println("No Gumball to release.");
	}
	
	void releaseMoney(){
		if(money_count>0)
		{
			int tempMoney=money_count;
			System.out.println("You can have your "+money_count+" cents back.");
			money_count=0;
		}
		else
			System.out.println("Your must have inserted two Quarters exactly. There is no Change.");
		
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}


	public boolean isGumballInSlot() {
		
		return gumballInSlot;
	}


	public void takeGumballFromSlot() {
		if(gumballInSlot==true)
		{
			System.out.println("Removing Gumball from the GumballMachine Slot");
			gumballInSlot=false;
		}
		else
			System.out.println("No Gumball in Slot.");
	}

	public int getMoney_count() {
		return money_count;
	}

	public void setMoney_count(int money_count) {
		this.money_count = money_count;
	}

	public void setGumballInSlot(boolean gumballInSlot) {
		this.gumballInSlot = gumballInSlot;
	}
}
