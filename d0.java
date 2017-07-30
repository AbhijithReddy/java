import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class d0 {
	public static void main(String[] args) {
        // Creating a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Reading a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Closing the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
      
	    // Code here that prints the contents of inputString to stdout.
		System.out.println(inputString);
	}
}