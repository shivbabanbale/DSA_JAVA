public class permutation_str {

public static void str_permutation(String str,String ans){

if(str.length()==0){
System.out.println(ans);
return;
}



for(int i=0;i<str.length();i++){
char corr=str.charAt(i);
String newstr=str.substring(0, i)+str.substring(i+1);
str_permutation(newstr,ans+corr);
}


}



    public static void main(String args[]){
        String str="abc";
        str_permutation(str,"");



    }
}
