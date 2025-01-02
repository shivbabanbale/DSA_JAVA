public class selection_sort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }

            }
            int swaped = arr[mini];
            arr[mini] = arr[i];
            arr[i] = swaped;

        }
        for (int m = 0; m <= arr.length - 1; m++) {
            System.out.print(arr[m] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 8, 2, 4, 5, 1 };
        selectionSort(arr);
    }
}