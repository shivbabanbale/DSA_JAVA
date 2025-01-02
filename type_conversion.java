public class type_conversion {
    public static void main(String argg[]) {

        // we can perform conversion only in campatitable data type
        // and form small to larger size;
        // byte->short->int->float->long->double
        int a = 52;
        float b = a;
        System.out.println(b);

        int c = 85;
        double d = c;
        long e = c;
        System.out.println(d);
        System.out.println(e);
        long f = 564;
        double g = f;
        System.out.println(g);
        byte h = 28;
        short i = h;
        System.out.println(i);

    }
}
