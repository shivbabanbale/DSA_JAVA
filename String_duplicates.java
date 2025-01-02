public class String_duplicates {
    
public static void Dupli_remover(String str,int indx, StringBuilder newstr,boolean arr[]){

if(indx == str.length()-1){
    System.out.println(newstr);
    return;
}

char curr=str.charAt(indx);
if(arr[curr-'a']==true){

    Dupli_remover( str, indx+1,  newstr, arr);
}

else{
    arr[curr-'a']=true;
    newstr.append(curr);
    Dupli_remover( str, indx+1,  newstr, arr);

}

}
public static void main(String[] args) {
    int indx=0;
    String str="apannacollege";
    StringBuilder newstr = new StringBuilder("");

    boolean arr[]=new boolean[26];
    Dupli_remover(str, indx, newstr, arr);
}


}
