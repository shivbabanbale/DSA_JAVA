import java.util.*;
public class pair_targeted_sum {

    public static boolean Find_paiar_Brute_force_approch(ArrayList<Integer>list,int target){

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){

                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;


    }

public static boolean Find_paiar_two_pointer_approch(ArrayList<Integer>list,int target){

    int lp=0;
    int rp= list.size()-1;
    while(lp != rp){
        if(list.get(lp)+list.get(rp)==target){
            return true;    

    }  if(list.get(lp)+list.get(rp)<target){
      lp++; 

}  if(list.get(lp)+list.get(rp)>target){
      rp++;

}
}
return false;
}
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        
        list.add(3);

        list.add(4);
        list.add(5);
        list.add(6);
        int target=18;
        // System.out.println(Find_paiar_Brute_force_approch(list,target));
        System.out.println(Find_paiar_two_pointer_approch(list,target));





    }
}