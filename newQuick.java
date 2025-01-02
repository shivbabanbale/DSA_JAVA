public class newQuick {

    public static void sorter(int arr[], int si, int ei) {
        if (si >= ei) {

            return;

        }
        int pivoteidx = partition(arr, si, ei);
        sorter(arr, si, pivoteidx - 1);
        sorter(arr, pivoteidx + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {

        int pivote = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {

            if (arr[j] < pivote) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
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

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 9, 7, 7, 1, 6, 3, 1, 4, 5, 2, 56 };
        sorter(arr, 0, arr.length-1);
        printer(arr);
    }
}
