package Day_06;

public class Product_Arr_excpt_itself {

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 9};
        int ans[] = exceptItSelf(arr);
        int n = arr.length;
        for(int i=0;i< n;i++){
        	System.out.print(ans[i]+" ");
        }
       
    }

    public static int[] exceptItSelf(int arr[]) {
        int n = arr.length;

        int left[] = new int[n];
        int right[] = new int[n];
        int ans[] = new int[n];

        // Left product
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        // Right product
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        // Final answer
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}
