
/**
 * Write a description of interface IGumballMachine here.
 * 
 * @author Deenash
 * @Datae 20-Feb-2015
 */

public interface IGumballMachine {
    void insertQuarter( ) ; 
    void insertDime( ) ;
    void insertNickel( );
    void turnCrank();
    boolean isGumballInSlot();    
    void takeGumballFromSlot();
}

