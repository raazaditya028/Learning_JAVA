package Day_04;

public class Array_and_target {

	public static void main(String[] args) {
		int arr[]={2,5,8,3,5,3,0,1};
		int target=6;
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==target){
					System.out.println(i+" "+j);
					temp=1;
					break;
				}
			}
			if(temp==1)break;
		}
		
		if(temp==0) System.out.println("Target not found");

 }
}