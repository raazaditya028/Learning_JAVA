package Day_03;

public class HCF {

	public static void main(String[] args) {
		int n1=60;
		int n2=40;
		
		int hcf=1;
		
		for(int i=2;i<=Math.min(n1, n2);i++){
			
			if(n1%i==0 && n2%i==0)
				hcf=i;
		}
			System.out.println(hcf);
	}

}
