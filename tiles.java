public class tiles {


public static int fitting(int n){
if(n==1 || n==0){
    return 1;
}

int vertical=fitting(n-1);
int horizontal=fitting(n-2);

return (vertical+horizontal);

}


    public static void main(String[] args) {
        int n =4;
     
       System.out.println(fitting(n));
    }
}
