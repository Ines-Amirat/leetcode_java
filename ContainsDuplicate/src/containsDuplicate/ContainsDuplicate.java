package containsDuplicate;

import java.util.Scanner;

public class ContainsDuplicate {
     
	
	public boolean duplicate (int[] nums ) {
		boolean duplicate ;
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j <= nums.length-1; j++) {
				if (nums[i] == nums[j]) {
					return duplicate = true ;

				}
			}
		}
		return  duplicate = false ;
	
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of the table");
		int N = scanner.nextInt();

		int[] nums = new int[N];
		System.out.println("Give the values of the array");
		for (int i = 0; i < N; i++) {
			System.out.print("value " + i + " ");
			nums[i] = scanner.nextInt();
		}

		System.out.println("\n prices table");
		for (int i = 0; i < N; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n");
		
		ContainsDuplicate d = new  ContainsDuplicate();
		boolean result = d.duplicate(nums);
		System.out.println(result);
		
		
		
		
		
	}

}
