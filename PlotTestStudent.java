
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a Plot object.
 * 
 * @author Farnaz Eivazi
 * @version 7/11/2022
 * 
 */
public class PlotTestGFA {
	private Plot plot1, plot5, plot2, plot3;

	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(2, 2, 6, 6);
		plot2= new Plot(1,1,8,8);
		plot3=new Plot(7,7,1,1);
		plot5 = new Plot(3, 4, 4, 3);
		
	}

	@After
	public void tearDown() throws Exception {
		plot1 = plot5 = null;
	}

	@Test
	public void testOverlaps() {
		assertTrue(plot1.overlaps(plot5)); 
	}
	
	@Test
	public void testToString() {
		assertEquals("3,4,4,3",plot5.toString());	
	}
	@Test
	public void testEncompasses1() {
		assertTrue(plot1.encompasses(plot5)); 
		assertFalse(plot5.encompasses(plot1));
		assertTrue(plot2.encompasses(plot1)); 
			
		
		assertFalse(plot3.encompasses(plot1)); 
		assertFalse(plot1.encompasses(plot3)); 
	}

}
