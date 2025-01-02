public class quickkkSort {

    public static void quuicker(int arr[], int si, int ei) {

if(si>=ei){
    return;
}



        int pivot = pivotindxfinder(arr, si, ei);
        quuicker(arr, si, pivot - 1);
        quuicker(arr, pivot + 1, ei);

    }

    public static int pivotindxfinder(int arr[], int si, int ei) {
        int pvt = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pvt) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }
        i++;
        int temp = pvt;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String args[]) {

        int arr[] = { 5, 9, 8, 7, 6, 2, 46, 56 };
        quuicker(arr, 0, arr.length - 1);
        printer(arr);

    }

    public static void printer(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

    }

}
