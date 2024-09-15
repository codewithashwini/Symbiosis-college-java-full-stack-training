package swap_no;

import java.util.Scanner;

public class Person {
	private static int i;
	int pId,pAge;
	String pName;
	public Person(int pId, int pAge,String pName) {
		this.pId=pId;
		this.pAge=pAge;
		this.pName=pName;
	}
	
	public void show() {
		System.out.println("Person Id:"+pId);
		System.out.println("Person Age:"+pAge);
		System.out.println("Person Name:"+pName);

	}
	public String toString() {
		return pName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		int id;String name;
		Person[] team=new Person[5];
		for(int i=0;i<team.length;i++)
			System.out.println("enter the id of person");
			id=sc.nextInt();
			System.out.println("enter the age of person");
			int age = sc.nextInt();
			System.out.println("enter the name of person");
			name=sc.next();
			team[i]=new Person(id, age, name);
				
	
	for(int i=0;i<team.length;i++) {
		team[i].show();
	}
	for(Person p: team) {
		System.out.println(p);
	}

	}
}	
