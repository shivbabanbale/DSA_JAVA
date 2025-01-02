public class function_overloading {
    public static int multiply(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static float multiply(int a,float b){
        float mul=a*b;
        return mul;
    }
    public static double multiply(double a,double b){
        double mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        int integermul = multiply(6, 5);
        System.out.println(integermul);
        float floatmul=multiply(6, 5.5f);
        System.out.println(floatmul);

        double doublemul=multiply(6.5, 5.9);
        System.out.println(doublemul);

        // here same function name but arguments are different === according to argument
        // select that specific function

    }
}
