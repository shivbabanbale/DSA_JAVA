public class twoD_probl {
    public static void Keycount(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == key) {
                    count++;
                }
            }

        }
        System.out.println("Count is " + count);

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        int key = 8;
        Keycount(arr, key);

    }
}
