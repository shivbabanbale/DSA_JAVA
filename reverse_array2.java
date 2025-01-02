public class reverse_array2 {
    public static void reverse_array(int arr[]) {
       int i=0;
       int j=arr.length-1;
       int temp;
            while(i< arr.length-1){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;

            }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 8, 10, 58, 85, 96, 120, 154, 241 }; // array must be in sorted by assending manner
        reverse_array(arr);

    }
}
