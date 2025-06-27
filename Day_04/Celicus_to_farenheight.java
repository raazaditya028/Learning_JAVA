package Day_04;

public class Celicus_to_farenheight {

    public static void main(String[] args) {

        for(int i = 20; i <= 100; i = i + 2) {
            int f = (int)((i * 1.8) + 32);
            System.out.println(i + "°C = " + f + "°F");
        }
    }
}
