package control;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exception.InvalidEntryException;

public class TestMultipleGenerator {

	// This test is supposed to test the first valid entry.
	@Test
	public void testGenerateMultiplusFirstValidEntry() throws Exception {
		this.testEntry(2, 10, "10, 20");
	}

	// This test is supposed to test the second valid entry.
	@Test
	public void testGenerateMultiplusSecondValidEntry() throws Exception {
		this.testEntry(3, 10, "10, 20, 30");
	}

	// This test is supposed to test the third valid entry.
	@Test
	public void testGenerateMultiplusThirdValidEntry() throws Exception {
		this.testEntry(1, 4, "4");
	}

	// This test is to test negative entry on numberOfMultiplus.
	@Test(expected = InvalidEntryException.class)
	public void testGenerateMultiplusNegativeEntryOnNumberOfMultiplus()
			throws Exception {
		this.testEntry(-1, 4, "does not matter");
	}

	// This test is to test when 0 is passed.
	@Test
	public void testGenerateMultiplusZeroTimes() throws Exception {
		this.testEntry(0, 10, "0 multiplus");
	}

	@Test
	public void testGenerateMultiplusZeroOnNumberToGetMultiplus()
			throws Exception {
		this.testEntry(3, 0, "0, 0, 0");
	}

	private void testEntry(final int numberOfTimes,
			final int numberToGetMultiplus, final String expectedResult)
			throws Exception {

		String multiplus = MultipleGenerator.generateMultiplus(numberOfTimes,
				numberToGetMultiplus);

		assertTrue(multiplus.equals(expectedResult));
	}
}
