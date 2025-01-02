public class break_in_loop {
    public static void main(String[] args) {
        for(int i=1; i<10;i++){
            if(i==4){
                break;
            }
            System.out.println(i);

        }
        System.out.println("i am out of loop");
    }
}
