public class length_og_string {

    public static int length_finder(String str, int count, int i) {
        if (i == str.length()) {
            return count;
        }
       

        return length_finder(str, count + 1, i + 1);
      
    }


    public static void main(String[] args) {
        String str = "ShivbaTheBoss";
        int i = 0;
        int count = 0;
       System.out.println(length_finder(str, count, i));

    }
}
