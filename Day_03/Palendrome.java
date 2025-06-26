package Day_03;
import java.util.*;
public class Palendrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(temp>0){
			int ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10;
		}
		if(rev==num)System.out.println("Palendrome");
		else System.out.println("Not a Palendrome");
	}

}
