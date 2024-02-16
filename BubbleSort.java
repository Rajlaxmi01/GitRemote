package Sorting;

public class BubbleSort {
	public static void swap(int arr[],int i, int j)
	{
		if(i == j)
			return;
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void main(String[] args) {
		int arr[]= {20,32,-99,48,4,2};
		
		for(int i= 0;i<arr.length;i--)
		{
			if(arr[i] >arr[i+1])
			{
				swap(arr,i,i+1);
			}
		}
			
		
	}

}
