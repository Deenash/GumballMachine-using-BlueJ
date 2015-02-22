
/**
 * Write a description of class GumballMachineTestDrive here.
 * 
 * @author Deenash 
 * @version (20-Feb-2015)
 */


public class GumballMachineTestDrive {

    public static void main(String[] args) {

        GumballMachine gbMac = new GumballMachine(5);

        System.out.println(gbMac);

        gbMac.insertQuarter();

        gbMac.turnCrank();

        System.out.println(gbMac);

        gbMac.insertQuarter();

        gbMac.turnCrank();

        System.out.println("\n\n\nGumball count remaining: "+gbMac.getCount()+" \n\n\n");

        gbMac.insertQuarter();

        gbMac.turnCrank();

        System.out.println(gbMac);
    	
    	
    	

	      gbMac = new GumballMachine(5);

	      System.out.println(gbMac);

	      gbMac.insertQuarter();
	      gbMac.insertDime();
	      gbMac.insertDime();
	      gbMac.insertDime();
	      gbMac.insertQuarter();
	      gbMac.turnCrank();
	      gbMac.insertDime();
	      gbMac.ejectQuarter();
	      System.out.println(gbMac);
    	
    }
}
