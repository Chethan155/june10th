class Worker {

 String name;
 int age;
 int height;
 String company;

 Worker(String name1,int age1,int height1,String company1)
 {
	 name=name1;
	 age=age1;
	 height=height1;
	 company=company1;

 }

 void work()
 {
	 System.out.println(name);
	 System.out.println(age);
	 System.out.println(height);
	 System.out.println(company);

 }
}
 class WorkerRunner
 {
	 public static void main(String[] args){
	 Worker ref=new Worker("suhas",25,5,"ibm");
	 ref.work();

	 ref.name="anu";
	 ref.age=25;
	 ref.height=6;
	 ref.company="amazon";
	 ref.work();

 }
 }
