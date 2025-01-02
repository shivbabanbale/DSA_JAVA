public class countingArraySort {

    public static void countingSort(int arr[]) {
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    count++;
                }

            }
            arr1[i] = count;

        }
        int m=0;
            for(int i=0;i<arr1.length;i++){
                while(arr1[i]>0){
                    arr1[m]=i;
                    m++;
                    arr1[i]--;
                }


            }


        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 9, 8, 7, 4, 5, 2, 6 };
        countingSort(arr);
    }
}
