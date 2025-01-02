public class logical_oprator {
    public static void main(String[] args) {
        System.out.println((3 < 8) && (8 > 2));
        System.out.println((3 < 8) && (8 > 10));// check both
        System.out.println((3 < 8) || (8 > 10));// check any one if both are false then false
        System.out.println((3 > 8) || (8 > 10));
        System.out.println(!(3 > 8));
        System.out.println(!(3 > 1));
    }
}
