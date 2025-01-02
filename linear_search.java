public class linear_search {

    public static int linear_check(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 9, 6, 8, 3, 4, 7, 2 };
        int key = 6;
        int index = linear_check(arr, key);
        if (index == -1) {
            System.out.print("element not found");
        } else {
            System.out.print("element " + key + " is found at" + index);
        }
    }
}
