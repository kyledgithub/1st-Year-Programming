import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char operate;
		float num1,num2;
		
		System.out.print("Enter your Number: ");
		num1 = input.nextInt();
		System.out.print("Symbol (+, -, *, /): ");
		operate = input.next().charAt(0);
		System.out.print("Enter your Number: ");
		num2 = input.nextInt();
		
		switch(operate) {
			case '+':
		    	System.out.println(num1 + num2);
		    break;
		    case '-':
		        System.out.println(num1 - num2);
			break;
			case '*':
			    System.out.println(num1 * num2);
			break;
			case '/':
			    System.out.println(num1 / num2);
			break;
			default:
			    System.out.println("Invalid Calculate.");
			input.close();
		}
	}
}
