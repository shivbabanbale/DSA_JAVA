public class bin_even_odd {
    public static void main(String[] args) {
        int n = 1111111;
        int p = n & 1;
        if ((n & p) == 1) {

            System.out.println("it is a odd number ");
        } else {
            System.out.print("It is a Even number");
        }
    }
}
