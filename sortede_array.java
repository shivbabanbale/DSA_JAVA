public class sortede_array {

    public static Boolean sortede_arr(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;

        } else if (arr[i] > arr[i + 1]) {
            return false;
        }
    return sortede_arr(arr, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 9, 8, 9, 12 };
        int i = 0;
        System.out.println(sortede_arr(arr, i));

    }
}
