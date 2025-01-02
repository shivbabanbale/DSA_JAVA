public class tapping_rainwater {

    public static int leftmax(int arr[], int i) {
        int maxu = Integer.MIN_VALUE;
        for (int j = 0; j < i; j++) {
            if (arr[j] > maxu) {
                maxu = arr[j];
            }
        }
        return maxu;
    }

    public static int rightmax(int arr[], int i) {
        int maxu = Integer.MIN_VALUE;
        for (int j = i + 1; j <= arr.length -1; j++) {
            if (arr[j] > maxu) {
                maxu = arr[j];
            }
        }

        return maxu;
    }

    public static void water_tapping(int arr[]) {
        int sum = 0;
        for (int i = 1; i < arr.length-1; i++) {
            int leftwala = leftmax(arr, i);
            int rightwala = rightmax(arr, i);
            if (leftwala > arr[i] && rightwala > arr[i]) {
                int minwala = Math.min(leftwala, rightwala);
                int tapwater = minwala - arr[i];
                sum = sum + tapwater;

            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6,3,2,5 };
        if (arr.length > 1) {
            water_tapping(arr);
        } else {
            System.out.println("Null water present");

        }
    }
}
