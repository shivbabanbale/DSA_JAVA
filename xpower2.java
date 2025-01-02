public class xpower2 {

    public static int power(int i, int n) {

        if (n == 1) {

            return i;
        }
int halfpower=power(i, n/2);

        if(n%2==0){
            return  halfpower * halfpower;
        }else{

            return i *halfpower*halfpower;
        }

        
    }

    public static void main(String[] args) {
        int i = 3;
        int n = 12;
        System.out.println(power(i, n));
    }
}
