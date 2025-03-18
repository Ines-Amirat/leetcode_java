package validParentheses;

import java.util.Scanner;

public class ValidParentheses {
    
	public boolean CheckPair (char[] tab) {
		    int a =0;
		    int b =0;
		    int c =0;
			for (int i = 0; i<= tab.length-1; i++) {
				if(tab[i] == '}' || tab[i] == '{') {
					a++;
				}
				if(tab[i] == ']' || tab[i] == '[') {
					b++;
				}
				if(tab[i] == ')' || tab[i] == '(') {
					c++;
				}
			}
			if(a % 2 != 0  || b % 2 != 0  || c % 2 != 0 ) {
			    	  return false ;
			}
			return true;
    }
	public boolean CheckFistElement (char[] tab) {
	           
				if (tab[0] == '}' || tab[0] == ']' || tab[0] == ')') {
					return false;
				}
				return true;
				
	}
		
		
	public String CheckElements (char[] tab) {	
		String result = "Invalid" ;
		boolean b= true;
		for (int i = 0; i <=tab.length-1; i++) {
			if(tab[i] == '{') {
				for (int j = i+1; j<=tab.length-1; j++) {
					if (tab[j] !=  '}') {
				    	result = "Invalid";
				    	b = false ;
					}
					else {
				        result = "valid";
				        b = true ;
						break;
					}
				}	
			}
			
			if (b == false) {
				return "Invalid";
			}
			if(tab[i] == ']') {
				for (int j = i+1; j<=tab.length-1; j++) {
					if (tab[j] !=  '[') {
				    	result = "Invalid";
				    	b = false ;
					}
					else {
				        result = "valid";
				        b = true ;
						break;
					}
				}	
			}
			if (b == false) {
				return "Invalid";
			}
			if(tab[i] == '(') {
				for (int j = i+1; j<=tab.length-1; j++) {
					if (tab[j] !=  ')') {
				    	result = "Invalid";
					}
					else {
				        result = "valid";
						break;
					}
				}	
			}
			if (b == false) {
				return "Invalid";
			}
         }
		return result;
	}

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string");
		String string = scanner.nextLine();
		
		
		char[] tab = string.toCharArray();
	
		ValidParentheses P = new  ValidParentheses();
		 
	 
	      if(!P.CheckPair(tab)) {
	    	  System.out.println("Invalid");
	      }
	      else if(!P.CheckFistElement(tab)) {
	    	  System.out.println("Invalid");
	      }
	      else { 
	    	  System.out.println(P.CheckElements(tab));
	      }
	      }
		
	}

 

