class InfosysRunner {
	
	
	
    public static void main(String[] args)
	{
        System.out.println("running main ...");
		
        Infosys detail = new Infosys("Narayan Murthy", "Sudha Murthy", 1981, 35186);

        System.out.println("founderName: " + detail.founderName);
        System.out.println("founderWifeName: " + detail.founderWifeName);
        System.out.println("founded: " + detail.founded);
        System.out.println("totalEmployees: " + detail.totalEmployees);
    }
	
	
	
}