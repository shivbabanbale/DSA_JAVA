public class num_to_string {

    public static void String_converter(int num, String arr[]) {
if(num==0){
    return;
}
        int last_digit = num % 10;
        num = num / 10;
    
            String_converter(num, arr);

        
        System.out.print(arr[last_digit] + " ");

    }

    public static void main(String args[]) {
        int num = 1256;

        String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String_converter(num, arr);

    }
}
