public class type_casting {
    public static void main(String arg[]) {

        // float a =12.5f;
        // int b=a; nahi hrrra kyoki point value decimal me karenge to kaise chalega
        float a = 12.55f;
        int b = (int) a;
        System.out.println(b); // point chya nantar cha part udte okkk !

        char naame = 'A'; // convert nahi kela phakt assci madhel value consider kela
        int number = naame;
        System.out.println(number);

        int num = 68;
        char ch = (char) num;
        System.out.println(ch);
    }
}
