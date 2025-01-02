public class linear_string {
    public static int lin_check(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String arr[] = { "shivba", "dnyani", "Mukund", "kedar" };
        String key = "kedar";
        int result = lin_check(arr, key);
        if (result == -1) {
            System.out.print("element not found");
        } else {
            System.out.print("element " + key + " is found at " + result);
        }
    }
}
