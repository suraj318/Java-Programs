package Coding;

public class BubbleSortArray {
	public static void main(String[] args) {
		
		int arr[]= {1,5,7,9,6,3,2,4,6,8,9,8,6,4};
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int n:arr) {
			System.out.print(n+ " ");
		}
	}

}
