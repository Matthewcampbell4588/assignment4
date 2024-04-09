
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
	Property sampleProperty;
	Property sampleProperty2;
	ManagementCompany mangementCo ; 
	
	@Before
	public void setUp() throws Exception {
		mangementCo= new ManagementCompany("Railey", "555555555",6);
		
	}

	@After
	public void tearDown() throws Exception {
		mangementCo=null;
	}
@Test
	public void testAddProperty() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);	
		assertEquals(mangementCo.addProperty(sampleProperty),0,0);//property has been succes	sfully added to index 0
	}
	@Test
	public void testTotalRent() {
		assertEquals(mangementCo.getTotalRent(),2613,2613);
	}

	@Test
	public void testMaxPropertyRent() {
		//assertEquals(mangementCo.maxPropertyRent(),2613);
	}

	@Test
	public void testIsMangementFeeValid() {
		assertTrue(mangementCo.isMangementFeeValid());
	}

	@Test
	public void testIsPropertiesfull() {
		assertFalse(mangementCo.isPropertiesfull());
	}

	@Test
	public void testRemoveLastProperty() {
		fail("Not yet implemented"); // TODO
	}
	
	
	
	@Test
	public void testGetPropertiesCount() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(mangementCo.addProperty(sampleProperty),0,0);	
		assertEquals(mangementCo.getPropertiesCount(), 1);
		
	}
	@Test
	public void testToString() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613.0, "BillyBob Wilson",2,5,2,2);
		assertEquals(mangementCo.addProperty(sampleProperty), 0);	//property has been successfully added to index 0
		String expectedString = "List of the properties for Railey, taxID: 555555555\n"
				+ "______________________________________________________\n"
				+ "Sunsational,Beckman,BillyBob Wilson,2613.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 156.78";
		System.out.println(expectedString);
		System.out.println(mangementCo.toString());
		assertEquals(expectedString, mangementCo.toString());
				
	}


}
