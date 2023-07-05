class Infosys{
	
	
	String founderName;
	String founderWifeName;
	int founded;
	double totalEmployees;
	

	Infosys(String founderName){
		System.out.println("Infosys running with String arg..");
		this.founderName=founderName;
		
	}
	
	Infosys(String founderName, String founderWifeName){
		this(founderName);
		System.out.println("Infosys running with String and String");
		this.founderWifeName=founderWifeNameName;
		
	}
	Infosys(String founderName, String founderWifeName,int founded){
		this(founderName,founderWifeName);
		System.out.println("Infosys running with String, String and int ");
		this.founded=founded;
		
	}
	Infosys(String founderName, String founderWifeName,int founded, double totalEmployees){
		this(founderName,founderWifeName);
		System.out.println("Infosys running with String, String, int and double");
		this.totalEmployees=totalEmployees;
		
	}
	}