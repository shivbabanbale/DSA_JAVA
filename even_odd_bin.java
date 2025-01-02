public class even_odd_bin {

    public static void even_odd_checker(int i) {

        // int res = i & 1;
        int j = 1;
        if ((i & 1)==0) {
            System.out.println("even hai bhai");
        } else {
            System.out.println("odd hai bhai");

        }

    }

    // ****************************** there is one mord method
    // ***********************/
    // n& (n+1)==0 then print even else odd

    public static void main(String[] args) {
        even_odd_checker(871);
    }
}
