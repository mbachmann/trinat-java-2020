package ch.trinat.edu.junit.jUnit3x;

import junit.framework.TestCase;

public class EuroTest extends TestCase{
	private Euro two;
	
	protected void setUp() throws Exception {
	}
	
	public void testAdding() throws Exception {
		two.add(two);
		assertEquals(new Euro(4.0).getAmount(), two.getAmount());
	}

	public void testInvalid() throws Exception {
		try {
			two.add(new Euro(-2.0));
			fail("IllegalArgumentException expected!");
		}
		catch (IllegalArgumentException ex) {
		}
	}

}
