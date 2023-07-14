package com.xworkz;

public class Resort {
	
	String name="ayatana coorg";
	String ownerName;
	ResortRoomType type;
	boolean breakFast;
	
	
	void setType(ResortRoomType type) {
		this.type=type;
	}
	
	Resort(String ownerName, boolean breakFast){
		this.ownerName=ownerName;
		this.breakFast=breakFast;
		
	}
	
	void display() {
		System.out.println("Resort Name : "+name);
		System.out.println("Resort owner Name : "+ownerName);
		System.out.println("Room type : "+this.type);
		System.out.println("BreakFast : "+this.breakFast);
	}

}
