import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();// to consume the \n character when reading a String after an Int
        for (int i = 0; i < n; i++){
        	String input = s.nextLine();
        	char[] ch = input.toCharArray();//converting string into char array
        	int size = input.length();//length() returns length of a string
        	//System.out.println("String converted to char array: " + Arrays.toString(charArr)); // printing char array as string
        	for (int j = 0; j < size; j++) {
        		System.out.print(ch[j]);
        		++j;
        	}
        	System.out.print(" ");
        	for (int k = 1; k < size; k++) {
        		System.out.print(ch[k]);
        		++k;
        	}
        	System.out.println();
        }
        
    }
}