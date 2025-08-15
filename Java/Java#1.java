import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // String
		Scanner i = new Scanner(System.in); // Int
		System.out.print("Enter yout Name: ");
		String name = s.nextLine();
    System.out.print("Enter your Age: ");
    int age = i.nextInt();
		System.out.print("Enter yur Section:");
		String section = s.nextLine();
		System.out.print("Enter your Course:");
		String course = s.nextLine();
		System.out.print("Enter your Address:");
		String address = s.nextLine();
		System.out.print("Enter your school: ");
		String school = s.nextLine();
    System.out.print("Enter your Subject 1 Grades: ");
		int sub1 = i.nextInt();
    System.out.print("Enter your Subject 2 Grades: ");
		int sub2 = i.nextInt();
    System.out.print("Enter your Subject 3 Grades: ");
		int sub3 = i.nextInt();
    System.out.print("Enter your Subject 4 Grades: ");
		int sub4 = i.nextInt();
    System.out.print("Enter your Subject 5 Grades: ");
		int sub5 = i.nextInt();
    System.out.print("Enter your Subject 6 Grades: ");
		int sub6 = i.nextInt();
    System.out.print("Enter your Subject 7 Grades: ");
		int sub7 = i.nextInt();
    System.out.print("Enter your Subject 8 Grades: ");
		int sub8 = i.nextInt();

   int average = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8) / 8;
    
		System.out.println("Hi my name is " + name);
    System.out.println("My age is " + age);
		System.out.println("My course is " + course + ", My section is " + section);
		System.out.println("My Address is " + address);
		System.out.println("My School is:" + school);		
    System.out.println("My GWA is: " + average);
	}
}
