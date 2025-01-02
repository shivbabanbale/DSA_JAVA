public class max_sum_prefix {
    public static void pairing(int arr[]) {
        // int i = 0;
        // int k = 1;
        // int m = 0;
        int gt = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];

        for (int i = 0; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i ; j < arr.length; j++) {
                int end = j;
                int sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                // System.out.print("{" + arr[i] + " ");
                // sum = sum + arr[i];
                // for (k = i + 1; k <= j; k++) {

                // System.out.print(arr[k] + " ");
                // sum = sum + arr[k];

                // }
                // System.out.print("}");
                // System.out.print(" sum is " + sum);
                if (sum > gt) {
                    gt = sum;
                }
                System.out.println();
            }

        }
        System.out.println("the greatest sum of subarray is " + gt);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 8, 10, 58, 85, 96, 120, 154, 241 }; // array must be in sorted by assending manner
        pairing(arr);
    }
}
