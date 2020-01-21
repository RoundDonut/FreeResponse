package tools;

import java.util.*;

public class ConsoleIO {
	
	private static Scanner input = new Scanner(System.in);
	   
	   public static int inputInt() 
	   {
	       int x = input.nextInt();
	       ConsoleIO.inputString();
	       return x;
	   }
	   
	   public static String inputString()
	   {
	       String x = input.nextLine();
	       return x; 
	   }
}
