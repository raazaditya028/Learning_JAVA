package Day_05;

public class sum_max_of_sub_arr_func {

    public static void main(String[] args) {
        int arr[] = {5, -2, -4, 6, 1, 2, -9};
        int result = MaxSum(arr);
        System.out.println("Maximum subarray sum: " + result);
    }

    public static int MaxSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
