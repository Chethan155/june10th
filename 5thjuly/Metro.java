class Metro{
	String line;
	int distance;
	String start;
	String destination;
	int capacity;
	
	
	
	
	Metro(String line){
		System.out.println("metro is running with String argument :");
		this.line=line;
	}
	Metro(String line){
		this(line);
		System.out.println("metro is running with String and int  :");
		this.distance=distance;
	}
	Metro(String line, int distance){
		this(line,distance);
		System.out.println("metro is running with String ,int and String :");
		this.start=start;
	}
	Metro(String line, int distance,String start){
		this(line,distance,start);
		System.out.println("metro is running with String ,int , String and String :");
		this.destination=destination;
	}
	Metro(String line, int distance,String start, int capacity){
		this(line,distance,start,destination);
		System.out.println("metro is running with String ,int , String , String and String :");
		this.capacity=capacity;
	}
	
}


class MetroRunner{
	
	public static void main(String [] metro){
		System.out.println(" running  main..");
		Metro train= new Metro("Purple",55,"kengeri","bayappanahalli",2500);
		
		System.out.println("Line :"+train.line);
		System.out.println("Distance :"+train.distance);
		System.out.println("start :"+train.start);
		System.out.println("destination :"+train.destination);
		System.out.println("capacity :"+train.capacity);
	}
}