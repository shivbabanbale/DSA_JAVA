public class insertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int curr = arr[i];
            int prevEle = i - 1;
            while (prevEle >= 0 && arr[prevEle] > curr) {
                arr[prevEle + 1] = arr[prevEle];
                prevEle--;
            }

            arr[prevEle + 1] = curr;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 23, 10, 5, 6, 7, 8, 9 };
        insertionSort(arr);
    }
}
