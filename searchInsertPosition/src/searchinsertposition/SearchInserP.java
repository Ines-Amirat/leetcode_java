package searchinsertposition;

import java.util.Scanner;


class RemoveD {
	 int k ;
	 int[] nums;
	 
	 RemoveD(int k, int[]nums){
		 this.k = k ;
		 this.nums =nums ;
	 }
}
public class SearchInserP {	
		
		
		public RemoveD RemoveDup (int[] nums ) {
			int k = 1;
      
			for (int i = 0; i < nums.length-1; i++) {
				for (int j = i+1; j <= nums.length-1; j++) {
					if (nums[i] < nums[j]) {
						nums[i+1] = nums[j]  ;
						nums[j]=0;
						k++ ; 
						break; 

					}
				}
			}
			
			for (int j = k; j <= nums.length-1; j++) {
				nums[j] = 0;
			}
			return  new RemoveD(k,nums)  ;
		
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

			System.out.println("\n table duplicate");
			for (int i = 0; i < N; i++) {
				System.out.print(nums[i] + " ");
			}
			
			System.out.println("\n");
			
			SearchInserP d = new  SearchInserP();
			RemoveD result = d.RemoveDup(nums);
			
			
			System.out.print(result.k);
			
			System.out.println("\n table duplicate");
			for (int i = 0; i < N; i++) {
				System.out.print(result.nums[i] + " ");
			}
			
			
			
			
			
			
			
		}

	}

