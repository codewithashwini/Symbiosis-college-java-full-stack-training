import java.util.Scanner;

class Person {
    String name, address;
    int age,phone;

    // Method to accept personal details
    public void acceptPersonalDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        
        System.out.print("Enter Phone: ");
        phone = sc.nextInt();


    }
    public void displayPersonalDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone"+ phone);
    }
}  
class Student extends Person {
    int[] marks = new int[5];
    int totalMarks;
    double percentage;
    String grade;

   
    public void acceptMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");
        totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
    }

    public void calculatePercentageAndGrade() {
        percentage = (totalMarks / 500.0) * 100;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }
    }

   
    public void displayStudentDetails() {
        displayPersonalDetails();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class PersonalDetails {

    public static void main(String[] args) {
        Student stud = new Student();

        stud.acceptPersonalDetails();

        stud.acceptMarks();
        stud.calculatePercentageAndGrade();

        System.out.println("\n--- Student Details ---");
        stud.displayStudentDetails();
    }
}
