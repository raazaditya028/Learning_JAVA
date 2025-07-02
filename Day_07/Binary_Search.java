package Day_07;

public class Binary_Search {

	public static void main(String[] args) {
		int arr[]={2,6,9,11,44,88};
		int ans = BS(arr,44);
		System.out.println(ans);
	}
	public static int BS(int arr[],int target){
		int i=0;
		int j=arr.length-1;
		while(i<=j){
			int mid=(i+j)/2;
			if (arr[mid]==target)return mid;
			else if(arr[mid]>target) j=mid-1;
			else i=mid+1;
		}
		return -1;
	}

}
