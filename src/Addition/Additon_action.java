package Addition;

import java.util.Scanner;

public class Additon_action {
	
	
	public static void main(String[] arg)
	{
	int a,b;

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	
	//Enter First Number
	a=sc.nextInt();
	
	System.out.println("Enter second number");
	
	//Enter Second Number
	b=sc.nextInt();
	
	Add r=new Add();
	r.addition(a,b);
	
	System.out.println("Addition of two numbers is : "+r.c);
	}

}
