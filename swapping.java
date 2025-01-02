public class swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int temp = a; // without temp it cant possible when we changing value a=b then b value goese
                      // to a and b=a the a is alraidy taken b value so b also same value.
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

}
