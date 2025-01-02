public class recursion {

    public static void main(String args[]) {
        recursion(10);

    }

    public static void recursion(int n) {
        if (n == 1) {

            System.out.println("1");
            return;
        }

        System.out.print(n + " ");

            recursion(n - 1);

        
    }

}
