package Day_04;

public class Min_Max_of_Array {

	public static void main(String[] args) {
		int arr[]={2,3,4,7,8,5,3,0,11};
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i])min=arr[i];
		}
		System.out.println(min+" "+max);

}
}
