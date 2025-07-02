package Day_05;

public class Array_Swap {

	public static void main(String[] args) {
			int arr[]={2,3,4,5,6,7};
//			int i=arr[4];
//			int j=arr[1];
			int temp=arr[1]; 
			arr[1]=arr[4];  
			arr[4]=temp;
			
			
			System.out.println(arr[4]);
}
}