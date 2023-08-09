package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Kidney.HumanKidney;
import com.xworkz.abstraction.app.Kidney.Kidney;
import com.xworkz.abstraction.app.Kidney.Manya;

public class KidneyRunner {

	public static void main(String[] args) {
		System.out.println("Runnin main in Kidney Runner\n");


		Kidney kid = new HumanKidney();

		Manya manya = new Manya(kid);
		manya.check();

	}

}
