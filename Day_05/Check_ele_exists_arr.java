package Day_05;

public class Check_ele_exists_arr {

	public static void main(String[] args) {
		int arr[]={3,1,4,-1,7,21,1,99,50};
		
		boolean found=Search(arr,50);
		System.out.println(found);

}
	public static boolean Search(int arr[],int target){
		for (int i=0;i < arr.length;i++){
			
			if(arr[i]==target) return true;

		}
		return false;
	}
}