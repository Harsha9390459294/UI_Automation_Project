package PageObjects;

import java.util.Arrays;

public class IntersectionQ {
	
	//arr1 = {"one","two","three","four","new"};
	//arr2= {"three","four","five","new"};
	
	public static void main(String args[]) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {3,4,5,6,7};
		int count = 0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					count++;
					System.out.println(arr1[i]);
				}
			}
		}
		
		//System.out.println(count);
		if(count==0) {
			System.out.println("No common elements");
		}
		
		
	}

}
