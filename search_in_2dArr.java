public class search_in_2dArr {

    public static boolean optimal_search(int arr[][], int key) {
        int i = 0;
        int j = arr[0].length-1;
        while (i < arr.length && j >= 0) {

            if (arr[i][j] == key) {
                System.out.println("array present a " + i + " " + j);
                return true;

            } else if (arr[i][j] > key) {

                j--;
            } else if (arr[i][j] < key) {
                i++;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;

        optimal_search(arr, key);
    }
}
