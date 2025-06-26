package Day_02;
import java.util.*;
public class Problem_of_Day {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		int cnt=0;
		int temp=num;
		int sum=0;
		while(temp!=0){
			temp=temp/10;
			cnt=cnt+1;
		}
		temp=num;
		while(temp!=0){
			int ld= temp%10;
			sum=sum+(int)Math.pow(ld, cnt);
			temp=temp/10;
		}
		if (num==sum){
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not an Armstrong");
		}
	}

}
