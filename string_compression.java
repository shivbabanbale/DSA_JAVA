public class string_compression {

    public static void compressor(String str) {
        String comp = "";
        for (int i = 0; i < str.length() - 1; i++) {
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {

                count++;
                i++;

            }
            comp += str.charAt(i);

            if (count > 1) {
                comp += count.toString();
            }

        }
        System.out.println(comp);
    }

    public static void main(String args[]) {
        String str = "aaabbccc";

        compressor(str);

    }
}
