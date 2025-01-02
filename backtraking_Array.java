public class backtraking_Array {

    public static void backtraker(int arr[], int si, int val) {

        if (si == arr.length) {
            printArr(arr);
            return;
        }
        arr[si] = val;
        backtraker(arr, si + 1, val + 1);

        arr[si] = arr[si] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        backtraker(arr, 0, 1);
        System.out.println();
        printArr(arr);

    }
}
