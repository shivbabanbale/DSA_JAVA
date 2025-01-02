public class merge_sort {

    public static void mergeSort(int arr[], int sp, int ep) {
        if (sp >= ep) {
            return;
        }
        int mid = sp + (ep - sp) / 2;
        // left sathi mearge sort
        mergeSort(arr, sp, mid);
        mergeSort(arr, mid + 1, ep);
        merger(arr,  sp,mid, ep);

    }

    public static void merger(int arr[], int sp, int mid, int ep) {

        int temp[] = new int[ep - sp + 1];
        int i = sp;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ep) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {

                temp[k] = arr[j];
                j++;
            }
            k++;

        }

        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        while (j <= ep) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = sp; k < temp.length; k++, i++) {

            arr[i] = temp[k];

        }

    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void main(String args[]) {

        int arr[] = { 2, 5, 9, 7, 1, 6, 3, 5, 1 };
        mergeSort(arr, 0, arr.length - 1);

        printarr(arr);

    }

}
