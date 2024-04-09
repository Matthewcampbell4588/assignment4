import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
	Property propertyOne;
	@BeforeEach
	void setUp() throws Exception {
		propertyOne = new Property("Property ACDC", "helldiver 2", 4550.00, "capital one");
	}

	@AfterEach
	void tearDown() throws Exception {
		propertyOne = null;
	}

	@Test
	void testToString() {
		assertEquals("Property ACDC,helldiver 2,capital one,4550.0",propertyOne.toString());
	}

}
