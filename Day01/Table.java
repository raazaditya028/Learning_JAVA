package Loops;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=5){
			int j=1;
			while(j<=10){
				System.out.println(i*j);
				j=j+1;
			}
			i=i+1;
			System.out.println();
		}
	}

}
