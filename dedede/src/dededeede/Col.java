package dededeede;

import java.util.Scanner;

public class Col {

	/*
	public int multiply(int a, int b) {
		int res = 0;
		if((a<0) && (b<0)) {
			
		    for(int i =b; i< 0; i++) {
		    	 res = res+a ;
		    }
			res =  res -res-res;
			return res ;
		}
		else if ((a>0) && (b>0)) {
			 for(int i =0; i< b; i++) {
		    	 res = res+a ;
		    }
			return res ;
		}
		else if ((a==0) || (b==0)) {
			return 0;
		}
		else if((a<0) || (b>0)) {
			if(a<0) {
				for(int i =0; i< b; i++) {
			    	 res = res+a ;
			    }
			}
			else if(a>0){
				 for(int i =b; i< 0; i++) {
			    	 res = res+b ;
			    }
			}
			return res ;
		}
		return res;
	}
	*/
	
	public int devide (int a , int b ) {
		int i=0;
		while (a != 0) {
			a= a-b;
			i++;
		}
		return b;
		
	}

	public static void main(String[] args) {
		Col c = new Col();
        
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int u = c.devide(4, 2);
		System.out.print(u);
	}

}
