package Day_02;
import java.util.*;

public class User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();  // only declare 'i' once, use it if needed
        int cr = 1;

        while (cr <= i) {  // use user input value here
            int star = 1;
            while (star <= cr) {
                System.out.print("*"); // use print instead of println for same line
                star = star + 1;
            }
            System.out.println();
            cr = cr + 1;
        }

//        sc.close();
    }
}
