// 4 C 8. There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an
// unknown pivot index k (1 <= k < nums.length) such that the resulting
// array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ...,
// nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at
// pivot index 3 and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target,
// return the index of target if it is in nums, or -1 if it is not in nums.
// Example 1:
// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
// Example 2:
// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1

import java.util.Scanner;

class Program8{
	
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Array Elements : ");
		int n = sc.nextInt();
		System.out.println(" ");
		int arra[] = new int[n];
		int temp=0;
		int p;

		for(int i=0;i<n;i++){

			System.out.print("Enter Array Element : " +"a[" +i+"] : ");
			arra[i]=sc.nextInt();
			System.out.println("");
		}

		System.out.println("How Many Times You Want to Rotate Array Left : ");
		p=sc.nextInt();

		for(int t=1;t<=p;t++){

			for(int k=0;k<n;k++){
				
				if(k<n-1){
					if(k==0) temp=arra[k];
				arra[k] = arra[k+1];
				}
				else{
					arra[k]=temp;
				}
			}
		}

		System.out.print("Enter Element of Array whose Position you want to find : ");
		int z=sc.nextInt();
		System.out.println(" ");
		int flag=0;

		for(int j=0;j<n;j++){

			if(arra[j]==z){ 

				System.out.println("Position is : " +j);
				flag++;
			}
		}

		if(flag==0){

			System.out.println("-1");
		}

	}
}