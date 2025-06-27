package Day_04;
import java.util.*;
public class Delhi_Odd_Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n =sc.nextInt();
		int odd=0;
		int even=0;
		while(n>0){
			int d=n%10;
			if(d%2==0) even=even+d;
			else odd =odd+d;
			
			n=n/10;
			
		}
		if((even!=0 && even%4==0)||(odd!=0 &&odd%3==0)){
			System.out.println("You can Ride");
		}
		else System.out.println("You cannot ride");
		
		//System.out.println(odd%3==0 || even%4==0?"You can Ride":"Sorry,You can't Ride");
		
	}

}
