public class bin_next_sort {

    public static int indexgenrator(int arr[], int tar, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {

            if (arr[si] <= tar && tar <= arr[mid]) {

                return indexgenrator(arr, tar, si, mid - 1);
            } else {
                return indexgenrator(arr, tar, mid + 1, ei);

            }

        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return indexgenrator(arr, tar, mid + 1, ei);

            } else {
                return indexgenrator(arr, tar, si, mid - 1);

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 65, 9, 7, 2, 6, 9, 5, 6 };
        int target = 5;
        int idx = indexgenrator(arr, target, 0, (arr.length - 1));
        System.out.print(idx);

    }
}
