public class large_in_array {
    public static void large_check(int arr[]) {
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("the maximum value is " + large);
        System.out.println("the smallest value is " + small);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9,  2, 45, 12 };
        large_check(arr);
    }
}
