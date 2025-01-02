public class reverse_num {
    //10089

    public static void main(String[] args) {
        int a=121;
        int sum=0;
        while(a!=0){   // for(a=56)
            int rt=a%10;
            // System.out.print(rt);
            sum=(sum*10)+rt;   
           a/=10;
        }
        System.out.println(sum);
    }
}
