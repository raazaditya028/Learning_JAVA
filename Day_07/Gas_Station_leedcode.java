package Day_07;

public class Gas_Station_leedcode {

	public static void main(String[] args) {
		int gas[]={1,2,3,4,5};
		int cost[]={3,4,5,1,2};
		
		int an s=find(gas,cost);
		System.out.println(ans);
}
	public static int find(int gas[],int cost[]){
		int n =gas.length;
		for(int i=0;i<n;i++){
			int fuel=0;
			int temp =0;
			for(int j=i;j<(n+i);j++){
				fuel=fuel+gas[i%n]-cost[j%n];
				if(fuel<0){
					temp=1;
					break;
					
				}
			}
			if (temp==0) return i;
		}
		return -1;
	}
}