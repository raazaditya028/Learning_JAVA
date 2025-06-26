package Day_03;

public class Happy_No {

	public static void main(String[] args) {
		 
		int n=19;
		int temp=0;
		for(int i=1;i<=1000;i++){
			
			int sum=0;
			while(n>0){
				sum=sum+(n%10)*(n%10);
				n=n/10;
				
			}
			if(sum==1){
				temp=1;
				break;
			}
			n=sum;
		}
		System.out.println(temp==1?"Happy number":"Sad number");
	}

}
