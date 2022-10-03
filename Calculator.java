package darrel;

import java.util.Scanner;

public class Calculator {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	double firstnum;
	double secondnum;
	double answer;
	
	System.out.println("Enter your first number: ");
	firstnum = scanner.nextDouble();
	
	System.out.println("Enter your second number: ");
	secondnum = scanner.nextDouble();
	

	answer = firstnum+secondnum;
	System.out.println("You're answer is: "+answer);
	
}
}
