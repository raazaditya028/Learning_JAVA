package Day_03;
import java.util.*;
public class Bostern_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		int fact=2;
		int factSum=0;
		int temp=num;
		
		while(temp>1){
			if(temp%fact==0){
				int tempfact=fact;
				
				while(tempfact>0){
					int ld=(tempfact%10);
					factSum=factSum+ld;
					tempfact=tempfact/10;
				}
				temp=temp/fact;
			}
			
			else fact++;
		}
		temp=num;
		int digitSum=0;
		while(temp>0){
			int ld=temp%10;
			digitSum=digitSum+ld;
			temp=temp/10;
		}
		System.out.println(digitSum==factSum?"Boston Number":"Not a Bostern Number");
	}

}
