import java.util.*;

public class more_water_finder_pointer {

    public static int more_water_finder_point(ArrayList<Integer> bars) {
        int maxwater = 0;
        int lp = 0;
        int rp = bars.size()-1;

        while (lp < rp) {
            int height = Math.min(bars.get(lp), bars.get(rp));
            int width = rp - lp;
            int currentwater = height * width;
            maxwater = Math.max(maxwater, currentwater);
                //update pointer
            if (bars.get(lp) < bars.get(rp)) {
                lp++;

            } else {
                rp--;
            }

        }

        return maxwater;
    }

    public static void main(String args[]) {

        ArrayList<Integer> bars = new ArrayList<>();
        bars.add(1);// 1,8,6,2,5,4,8,3,7
        bars.add(8);
        bars.add(6);
        bars.add(2);
        bars.add(5);
        bars.add(4);
        bars.add(8);
        bars.add(3);
        bars.add(7);

        System.out.println(more_water_finder_point(bars));
    }

}
