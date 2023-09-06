package PageObjects;

public class SecondLargestInt {
	
	//{1,51,23,22,34}
	
	public static void main(String args[]) {
		
		int[] arr = {1,5,23,22,34};
		int big = arr[0];
		int count =0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>big) {
				big = arr[i];
				count++;
				if(count == 1) {
					big=arr[0];
					count = 2;
					continue;
				}
			}
		}
		
	 System.out.println(big);
	 //System.out.println(count);
	}

}
