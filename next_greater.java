
import java.util.Stack;

public class next_greater {
    public static void next_greater_finder(int arr[], int greater[]) {
        Stack<Integer> stk = new Stack<>();
        stk.push(arr.length-1);
        greater[greater.length-1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {

            while (!stk.isEmpty() && arr[i] >= arr[stk.peek()]) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                greater[i] = -1;
            } else {
                greater[i] =arr[stk.peek()];

            }
            stk.push(i);
        }
    }

    public static void main(String args[]) {

        int arr[] = { 4,2,1,9,5,3};
        int greater[] = new int[arr.length];
        next_greater_finder(arr, greater);
        for (int i = 0; i < greater.length; i++) {
            System.out.println(greater[i] + " ");
        }

    }
}
