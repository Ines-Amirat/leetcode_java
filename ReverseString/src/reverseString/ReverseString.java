package reverseString;

import java.util.Scanner;



public class ReverseString {
    
	public char[] ReverseStr (char[]string) {
		int length = string.length-1 ;
		for(int i = 0; i<string.length/2; i++) {
			 char perm = string[i];
			 string [i] = string[length];
			 string[length] = perm;
			 length-- ;
			
			 
		}
		return string ;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string");
		String string = scanner.nextLine();
		
		System.out.print(string);

		 
		char[] tab = string.toCharArray();
	
		ReverseString R = new  ReverseString();
		
		R.ReverseStr(tab);
		System.out.print("\n" );
		for(int i = 0; i<tab.length; i++) {
			 System.out.print(tab[i]+ " ");
		}
	    

	}

}
