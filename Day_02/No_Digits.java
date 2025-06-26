package Day_02;
import java.util.*;
public class No_Digits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		int cnt=0;
		while(i!=0){
			i=i/10;
			cnt=cnt+1;
		}
		System.out.println(cnt);

	}

}
