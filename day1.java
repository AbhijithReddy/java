import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		/* Declare second integer, double, and String variables. */
        int i1;
        double d1;
        String s1;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i1 = scan.nextInt();
		d1 = scan.nextDouble();
		scan.nextLine();//It seems nextInt doesnt' consume the '\n' character and hence '\n' becomes the input for nextLine.
		s1 = scan.nextLine();//To solve this the above nexLine methid is included.
		System.out.println(s1);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i1);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d + d1);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
		System.out.println(s1);
		System.out.println(s + s1);
	    scan.close();
    }
}