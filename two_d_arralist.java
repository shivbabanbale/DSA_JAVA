import java.util.*;

public class two_d_arralist {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        mainlist.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(6);
        mainlist.add(list2);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currentlist = mainlist.get(i);
            for (int j = 0; j < currentlist.size(); j++) {
                System.out.print(currentlist.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
        
    }

}
