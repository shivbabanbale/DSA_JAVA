public class substring {

    public static void substringbanalo(String str,int st,int ep){

String substring="";
 for(int i=st;i<ep;i++){

substring +=str.charAt(i);

 }

 System.out.println(substring);

    }

    public static void main(String[] args) {
        String str = "lalaMargaya";

        substringbanalo(str, 0, 7);
    }
}
