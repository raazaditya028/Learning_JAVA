package Day_04;
import java.util.*;
public class Abundant_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int factSum=1;
		for(int i=2;i<=n;i++){
			if(n%i==0)factSum=factSum+i;
			
		}
		System.out.println(n==factSum?"Neutral Number":n>factSum?"Deficet Number":"Abundant Number");
	}
	

}
