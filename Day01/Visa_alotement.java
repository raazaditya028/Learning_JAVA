package Visa_Cond;

public class Visa_alotement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Salary=100000;
		char visa='A';
		if(visa =='A'){
			if(Salary>=100000){
				System.out.println("The person is Ultra Rich");
			}
			else if(Salary<100000 && Salary>50000){
				System.out.println("The person is Rich");
			}
			else if(Salary<50000 && Salary>20000){
				System.out.println("The person is Midle Class");
			}
			else {
				System.out.println("The person is Average Salaried");
			}
		}

	}

}
