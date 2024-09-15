package polymorphisum;

public class Student {
	int rollno;
	String name;
public static void register() {
	System.out.println("No Args Method");
}
public void register(int rollno) {
	this.rollno=rollno;
	System.out.println("only to register with rollno :"+ rollno);
	
}
public void register(int rollno,String name) {
	this.rollno=rollno;
	this.name=name;
	System.out.println("register with roll no as well as name:" +rollno+ " and name:" +name);
	
}
public void register(String name,int rollno) {
	this.rollno=rollno;
	this.name=name;
	System.out.println("register with roll no as well as name along with change is:" +name+ " and roll no:"+rollno);
}

	


}
