package Child_Driving_Rule;

public class Driving_Cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		if(age<15){
			System.out.println("Cannot sit in front seat");
		}
		else if(age>=15&&age<=18){
			System.out.println("Allowed to sit in front seat");
		}
		else if (age>=18&&age<=19){
			System.out.println("allowed to sit in driving seat and only touch handle");
		}
		else{
			System.out.println("Bhai tum drive kar skte ho");
		}
	}

}
