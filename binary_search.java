public class binary_search {
    public static int binary_search(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 8,10, 58, 85,96,120,154,241 }; // array must be in sorted by assending manner
        int key =120 ;
        System.out.println(binary_search(arr, key));
    }
}
