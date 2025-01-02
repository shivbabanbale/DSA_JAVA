public class bubble_sort {

    public static void bubble_sort(int arr[]) {
        int i = 0;
        while (i < arr.length - 1) {
            boolean task = false;
            for (int a = 0; a < arr.length - 1 - i; a++) {

                int swaped;
                if (arr[a] > arr[a + 1]) {
                    swaped = arr[a + 1];
                    arr[a + 1] = arr[a];
                    arr[a] = swaped;
                    task = true;
                }

            }
            if (!task) {
                break;

            }
        }

        i++;

        for (int m = 0; m <= arr.length - 1; m++) {
            System.out.print(arr[m] + " ");
        }

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 23, 10, 5, 6, 7, 8, 9 };
        bubble_sort(arr);
    }
}
