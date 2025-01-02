public class friend_pairing {

    public static int pairing(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        int single = pairing(n - 1);
        int doubl =pairing(n - 2);
         int way_in_doubl=(n-1)* doubl;
        return (single + way_in_doubl);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(pairing(n));
    }
}
