public class indice_occurence {

    public static void occurence(int arr[], int i, int key) {

        if (i == arr.length) {
            return;

        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        occurence(arr, i + 1, key);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int i = 0;
        int key = 2;
        occurence(arr, i, key);
    }
}
