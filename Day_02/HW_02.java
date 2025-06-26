package Day_02;

public class HW_02 {

	public static void main(String[] args) {
		int ele=2;
		int f=0;
		int s=1;
		System.out.println(f+" "+s+" ");
		
		while(ele<=8){
			int sum=f+s;
			System.out.println(sum+" ");
			f=s;
			s=sum;
			
			ele=ele+1;
		}

	}

}
