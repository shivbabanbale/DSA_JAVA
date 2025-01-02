public class uppercase {

    public static void upperconverter(String str) {
        StringBuilder str1 = new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        str1.append(ch);
        for (int i = 1; i < str.length(); i++) {


            if (str.charAt(i) == ' ') {
               char up= Character.toUpperCase(str.charAt(i + 1));
               str1.append(" ");
               str1.append(up);
               i++;
            }else{
                char lw=str.charAt(i);
                str1.append(lw);
            }

        }
        System.out.println(str1);
    }

    public static void main(String[] args) {
        String str = "My name is shivba banbale";
        upperconverter(str);
    }
}
