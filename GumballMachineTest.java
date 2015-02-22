

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  Deenash
 * @version 20-Feb-2015
 */

public class GumballMachineTest {

	GumballMachine gm;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		gm=new GumballMachine(2);
		gm.insertQuarter();
		gm.insertDime();
		gm.insertNickel();
		gm.turnCrank();
		assertEquals(false, gm.isGumballInSlot());
	}


    @Test
    public void test2()
    {
    	gm=new GumballMachine(2);
        gm.insertQuarter();
        gm.insertQuarter();
        gm.turnCrank();
        assertEquals(true, gm.isGumballInSlot());
        gm.takeGumballFromSlot();
        assertEquals(false, gm.isGumballInSlot());
    }

    @Test
    public void test3()
    {
    	gm=new GumballMachine(5);
        gm.insertQuarter();
        gm.insertDime();
        gm.insertQuarter();
        gm.turnCrank();
        assertEquals(4, gm.getCount());
    }

    @Test
    public void test4()
    {
    	gm=new GumballMachine(2);
        gm.insertQuarter();
        gm.insertQuarter();
        gm.insertNickel();
        gm.turnCrank();
        gm.takeGumballFromSlot();
        assertEquals(0, gm.getMoney_count());
    }

    @Test
    public void test5()
    {
    	gm=new GumballMachine(2);
        gm.insertDime();
        gm.insertQuarter();
        gm.turnCrank();
        gm.insertDime();
        gm.insertNickel();
        gm.turnCrank();
        gm.takeGumballFromSlot();
        gm.insertQuarter();
        gm.turnCrank();
        assertEquals(false, gm.isGumballInSlot());
    }

}


