public class maz_in_Array_kadans_algo {
    public static void kadans_algo(int arr[]) {
        int i = 1;
        int curr = 0;
        int maxsum = Integer.MIN_VALUE;
        // curr=arr[i]
        for (i = 1; i < arr.length; i++) {
            curr = arr[i] + curr;
            if (curr < 0) {
                curr = 0;
            }
            if (curr > maxsum) {
                maxsum = curr;
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadans_algo(arr);
    }
}
