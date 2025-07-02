package Day_07;

public class Square_Root {

    public static void main(String[] args) {
        int num = 26;
        System.out.println("Square root of " + num + " is: " + sqrt(num));
    }

    public static int sqrt(int x) {
        int i = 0;
        int j = x;
        int ans = 0;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            // To prevent integer overflow:
            if ((long) mid * mid == x) return mid;
            else if ((long) mid * mid < x) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return ans; // Integer part of square root
    }
}

