public class quick {

    public static void QuickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;

        }

        int pivoteindex = partition(arr, si, ei);
        QuickSort(arr, si, pivoteindex - 1);
        QuickSort(arr, pivoteindex + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {

        int pivote = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                // return i;

            }

        }
        i++;
        int temp = pivote;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void printer(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {

        int arr[] = { 5, 9, 6, 3, 2, 1, 7, 5, 6, 9 };
        int length = arr.length - 1;
        QuickSort(arr, 0, length);
        printer(arr);
    }
}
