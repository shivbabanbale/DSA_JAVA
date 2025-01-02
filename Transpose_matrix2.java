public class Transpose_matrix2 {
    public static void Transpose(int arr[][]) {
// int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
          int temp=arr[i][j];
          arr[i][j]=arr[j][i];
          arr[j][i]=temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 11, 12, 13 },
                { 21, 22, 23 },
                { 56, 25, 66 }
        };

        Transpose(arr);
    }
}