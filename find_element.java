public class find_element {

    public static int find_ele(int arr[], int key, int i) {

        if (i == arr.length - 1) {
            if (arr[i] == key) {

                return i;
            } else {
                return -1;
            }

        }
        if (arr[i] == key) {
            return i;
        }
        return find_ele(arr, key, i + 1);

    }

    public static int last_ele(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int isfound = last_ele(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 5, 4, 7, 9, 3, 5, 6, 9 };
        int key = 4;
        int i = 0;
        System.out.println(last_ele(arr, key, i));

    }
}
