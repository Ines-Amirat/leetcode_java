package twoSum;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
            Scanner scanner =  new Scanner(System.in);
            
            System.out.println("Enter the target");
            int target = scanner.nextInt();
            
            
            System.out.println("Enter the length of the table");
            int N = scanner.nextInt();
            
            
            int[] nums  = new int[N];
            System.out.println("Give the values of the table");
            for (int i=0 ; i<N; i++) {
            	  System.out.println("Value "+ i);
            	  nums[i] = scanner.nextInt();
                   
    		}
            
            Sum sum = new Sum();
            
            int[] result  = new int[2]; 
            result = sum.sum(target, nums);
            
            
            System.out.println("[" + result[0] + "," + result[1] +"]");
          
	}

}
