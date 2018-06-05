package TestingPR;

import java.util.Calendar;

public class TestClass {
	public static void main(String[] args) {
		int year = 1;

		
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int currentYearDigit = (currentYear - currentYear / 100 * 100) / 10;
		int RequstedYearDigit = Character.getNumericValue(year);
		int yearResponse = (currentYear % 10 > RequstedYearDigit) ? ++currentYearDigit : currentYearDigit;
		String s = String.format("%d%c", yearResponse, year);
		System.out.println("S : '" + s + "'");



	}

}
