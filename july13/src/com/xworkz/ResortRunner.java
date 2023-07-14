package com.xworkz;

public class ResortRunner {

	public static void main(String[] args) {
		  
		
		Resort resort1 = new Resort("kumar",true);
		resort1.setType(ResortRoomType.PRESEDENTIAL_SUITE);
		resort1.display();
		
		
		Resort resort2 = new Resort("ravi",true);
		resort2.setType(ResortRoomType.EXECUTIVE_SUITE);
		resort2.display();
		

	}

}
