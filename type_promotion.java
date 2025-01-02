public class type_promotion {
    public static void main(String arg[]){
char a='A';
char b='B';
System.out.println((int)(a));
System.out.println(b-a);

short aa=54;
byte bb= 68;
char cc='A';
// byte dd = aa+bb+cc; byte dd = aa+bb+cc; not possible becouse we calculate successfully  but int to byte we cant send
double dd=aa+bb+cc;
System.out.println(dd);


byte first=5;
byte second=2;

byte ddd=(byte) (first + second);
System.out.println(ddd);
    }
    
}
