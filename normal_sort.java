public class normal_sort {

    public static void bubble_sort(int arr[]) {
        for (int j = arr.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                int swaped;
                if (arr[i] > arr[j]) {
                    swaped = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swaped;
                }
            }
        }
        System.out.print("the sorted array is :- ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 9, 7, 1, 2, 8, 3, 4, 6, 2 };
        bubble_sort(arr);
    }

}
