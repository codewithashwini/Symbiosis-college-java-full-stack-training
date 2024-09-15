package polymorphisum;

public class student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.register();
		Student student = new Student();
		student.register(101);
		student.register(102,"ashu");
		student.register("nirmiti", 103);
	}

}
