package Swap;

import java.util.Scanner;

public class Swapping {
	
	public static void main(String args[])
	   {
	      int x, y;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	 
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	      Swapping_action sw = new Swapping_action();
	     int[] swapArray = sw.swap(x, y);
	     
	     
	     
	   
	      
	   System.out.println("After Swapping\nx = "+swapArray[0]+"\ny = "+swapArray[1]);
	
	
	   }
	
	
	      

}
