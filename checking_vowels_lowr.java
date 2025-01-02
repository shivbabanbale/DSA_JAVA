import java.util.Scanner;

public class checking_vowels_lowr {

public static void checking_lvr_vowels(String str) {
    int count=0;
for(int i=0;i<=str.length()-1;i++){
    char lwr =Character.toLowerCase(str.charAt(i));
if(str.charAt(i)==lwr){
    count++;
}


}
System.out.println(count);


}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plese enter a string");
        String str = sc.nextLine();
        System.out.println(str);

        checking_lvr_vowels(str);
    }
}