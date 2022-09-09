import java.util.Scanner;
public class Java_Exercises {
	public static void main(String[]args) {
	
	Scanner sc1 = new Scanner (System.in);	
		
	//Exercise 1:
	System.out.println("First exercise:");
	int n1; 
	int n2; 
	int result;
	n1 = 36;
	n2 = 74;
	result = n1 + n2; 
	System.out.println("Your result is: " + result);
	
	//Exercise 2:
	System.out.println("Second exercise:");
	n1 = 50; 
	n2 = 3;
	result = n1/n2; 
	System.out.println("Your second result is: " + result);
	
	//Exercise 3:
	System.out.println("Third exercise:");
	int problem1;
	int problem2;
	int problem3;
	int problem4;
	problem1 = -5 + 8 * 6;
	problem2 = (55+9) % 9;
	problem3 = 20 + -3*5 / 8;
	problem4 = 5 + 15 / 3 * 2 - 8 % 3;
	System.out.println("Your problems results is: " + problem1 + "\n" + problem2 + "\n" + problem3 + "\n" + problem4);
	
	//Exercise 4:
	System.out.println("Fourth exercise:");
	System.out.println("Write your first number (25)");
	n1 = sc1.nextInt();
	System.out.println("Write your second number (5)");
	n2 = sc1.nextInt();
	result = n1 * n2;
	System.out.println(n1 + " * " + n2 + " = " + result);
	
	//Exercise 5:
	System.out.println("Fifth exercise:");
	System.out.println("Write your first number (125)");
	n1 = sc1.nextInt();
	System.out.println("Write your second number (24)");
	n2 = sc1.nextInt();
	result = n1 + n2;
	System.out.println(n1 + " + " + n2 + " = " +result);
	result = n1 - n2;
	System.out.println(n1 + " - " + n2 + " = " +result);
	result = n1 * n2;
	System.out.println(n1 + " * " + n2 + " = " +result);
	result = n1 / n2;
	System.out.println(n1 + " / " + n2 + " = " +result);
	result = n1 % n2;
	System.out.println(n1 + " % " + n2 + " = " +result);
	}
	
}