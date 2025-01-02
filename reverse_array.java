public class reverse_array {
    public static void reverse_array(int arr[]) {
        int arr1[] = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            arr1[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 8, 10, 58, 85, 96, 120, 154, 241 }; // array must be in sorted by assending manner
        reverse_array(arr);
    }
}
