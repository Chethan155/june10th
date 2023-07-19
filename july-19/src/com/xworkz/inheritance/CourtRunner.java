package com.xworkz.inheritance;

public class CourtRunner {

	public static void main(String[] args) {
		Court court = new Court();
		court.justice();

		SupremeCourt supremeCourt = new SupremeCourt();
		supremeCourt.justice();
		supremeCourt.importantCase();

		HighCourt highCourt = new HighCourt();
		highCourt.importantCase();
		highCourt.criminalCase();
		highCourt.forgeryCase();

		CivilCourt civilCourt = new CivilCourt();
		civilCourt.criminalCase();
		civilCourt.forgeryCase();
		civilCourt.propertyCase();
		civilCourt.theftCase();

		FamilyCourt familyCourt = new FamilyCourt();
		familyCourt.forgeryCase();
		familyCourt.propertyCase();
		familyCourt.theftCase();
		familyCourt.divorce();


	}


}
