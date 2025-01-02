public class sortProblems {

    // bubble sort
    public static void bubble_sort(int arr[]) {

        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int j = 0; j < arr.length - 1 - pass; j++) {
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // selection sort

    public static void selction_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minwala = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[minwala]) {
                    minwala = j;
                }

            }
            int temp = arr[minwala];
            arr[minwala] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // insertion sort

    public static void insertion_sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prevel = i - 1;
            while (prevel >= 0 && arr[prevel] < curr) {

                arr[prevel + 1] = arr[prevel];
                prevel--;
            }

            arr[prevel + 1] = curr;

        }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // counting sort

    public static void counting_sort(int arr[]) {
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (i == arr[j]) {
                    count++;
                }

            }

            arr1[i] = count;

        }

        int k = arr1.length - 1;
        for (int i = 0; i < arr1.length-1; i++) {
            while (arr1[i] > 0) {
                arr[k] = i;
                k--;
                arr1[i]--;

            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {

        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        // bubble_sort(arr);
        // selction_sort(arr);
        // insertion_sort(arr);
        counting_sort(arr);

    }
}
