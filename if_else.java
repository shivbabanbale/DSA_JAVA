import java.util.*;
public class if_else {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your Age ");
    int age=sc.nextInt();
    if(age >= 18){
        System.out.println("Adult ho gaye bhai");
    }else{
    if((age>=16) &&(age<18)  ){
        System.out.println("Tum to javan ho rahe ho");
    }
    else{
        System.out.println("Tum Abhi bhi bacche ho");
    }}

  }  
}
