import java.util.ArrayList;

public class ArrrayList {
    public static void swap(ArrayList<Integer> List1, int ind1, int ind2) {
        int temp = List1.get(ind1);
        List1.set(ind1, ind2);
        List1.set(ind2, temp);

    }

    public static void main(String args[]) {
        ArrayList<Integer> List1 = new ArrayList<>();
        // ArrayList <String> List2=new ArrayList<>();

        List1.add(1);// time complexty 0(n)
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(5);
        List1.add(0, 6);

        // System.out.println(List1);
        // //geting element in the arraylist
        // int ll= List1.get(2);
        // System.out.println(ll); // time complexty 0(n);

        // List1.remove(2);
        // System.out.println(List1);

        // List1.set(1, 6);
        // System.out.println(List1);

        System.out.println(List1.contains(1));
        System.out.println(List1.contains(6));
        // System.out.println(List1.size());

        for (int i = 0; i < List1.size(); i++) {
            System.out.print(List1.get(i) + " ");

        }

        // Swapping of element in ArrayList
        
        swap(List1, 1, 3);
        System.out.println();

        for (int i = 0; i < List1.size(); i++){
            System.out.print(List1.get(i) +" ");
        }

    }
}
