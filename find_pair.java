public class find_pair {
    public static void pairing(int arr[]) {
        int i = 0;
        int k = 1;
        int m = 0;
        int gt = Integer.MIN_VALUE;

        int arr2[] = new int[arr.length];

        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = 0;

                System.out.print("{" + arr[i] + " ");
                sum = sum + arr[i];
                for (k = i + 1; k <= j; k++) {

                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];

                }
                System.out.print("}");
                System.out.print(" sum is " + sum);
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
