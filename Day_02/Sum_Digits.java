package Day_02;
import java.util.*;
public class Sum_Digits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int x=sc.nextInt();
		int sum=0;
		int ld=0;
		while(x!=0){
			ld=x%10;
			sum=sum+ld;
			x=x/10;
		}
		System.out.println(sum);
	

	}

}
