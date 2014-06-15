/**
 * This class is to generate multiples.
 * 
 * license: this code is under of the license <i>gpl</i>.
 */
package control;

import exception.InvalidEntryException;

public class MultipleGenerator {

	/**
	 * This method generates an given number of multiples of a given number.
	 * 
	 * @param numberOfMultiplus
	 *            is the number of multiples wanted.
	 * @param numberToGetMultiplus
	 *            is the number the multiples are wanted.
	 * @return String containing (numberOfMultiples) times the multiples of
	 *         numberToGetMultiplus.
	 * @throws InvalidEntryException
	 *             if any parameter passed is negative, this exception is
	 *             trigger.
	 */
	public static String generateMultiplus(final int numberOfMultiplus,
			final int numberToGetMultiplus) throws InvalidEntryException {

		if (numberOfMultiplus >= 0) {
			String multiplus = MultipleGenerator.generateMultiplusPrivate(
					numberOfMultiplus, numberToGetMultiplus);
			// explain

			assert (multiplus != null);

			return multiplus;
		} else {
			throw new InvalidEntryException();
		}
	}

	/**
	 * 
	 * @param numberOfMultiplus
	 * @param numberToGetMultiplus
	 * @return
	 */
	private static String generateMultiplusPrivate(final int numberOfMultiplus,
			final int numberToGetMultiplus) {
		assert (numberOfMultiplus >= 0);
		assert (numberToGetMultiplus >= 0);

		String multiplus = new String();
		// this variable will keep the string until return.

		if (numberOfMultiplus > 0) {
			multiplus = MultipleGenerator.generateStringOfMultiplus(
					numberOfMultiplus, numberToGetMultiplus);

			// assert aqui
		} else {
			multiplus = "0 multiplus";
		}

		return multiplus;
	}

	/**
	 * 
	 * @param numberOfMultiplus
	 * @param numberToGetMultiplus
	 * @return
	 */
	private static String generateStringOfMultiplus(int numberOfMultiplus,
			int numberToGetMultiplus) {
		String multiplus = new String();
		// explain

		for (int i = 1; i <= numberOfMultiplus; i++) {
			int multiplier = i * numberToGetMultiplus;

			multiplus += Integer.toString(multiplier);

			multiplus = MultipleGenerator.insertComma(multiplus, i,
					numberOfMultiplus);
			// assert nessa merda

		}

		return multiplus;
	}

	/**
	 * 
	 * @param multiplus
	 * @param position
	 * @param numberOfMultiplus
	 * @return
	 */
	private static String insertComma(String multiplus, final int position,
			final int numberOfMultiplus) {
		
		if (position < numberOfMultiplus) {
			multiplus += ", ";
		} else {
			// nothing to do.
		}

		return multiplus;

	}
}