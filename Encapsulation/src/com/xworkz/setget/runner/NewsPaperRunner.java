package com.xworkz.setget.runner;

import com.xworkz.setget.app.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) {
		
		
		NewsPaper newsPaper = new NewsPaper();
		System.out.println(newsPaper);

		newsPaper.setColor(true);
		newsPaper.setCost(5);
		newsPaper.setLanguage("Kannada");
		newsPaper.setName("Vijaya karnataka");
		newsPaper.setNoOfPages(12);

		System.out.println(newsPaper);


	}

}
