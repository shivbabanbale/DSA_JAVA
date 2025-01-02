import java.util.*;
public class more_water_finder {

public static int max_water_finder(ArrayList<Integer>bars){

// finding water that hold max beetween two bars 
int max_water=0;

for(int i=0;i<bars.size();i++){
    for(int j=0;j<bars.size();j++){
        int height=Math.min(bars.get(i),bars.get(j));
        int width=j-i;
       int water_containt=height*width;
       max_water=Math.max(max_water, water_containt);

    }
}
return max_water;
}




    public static void main(String args[]){
        ArrayList<Integer>bars=new ArrayList<>();
        bars.add(1);//1,8,6,2,5,4,8,3,7
        bars.add(8);
        bars.add(6);
        bars.add(2);
        bars.add(5);
        bars.add(4);
        bars.add(8);
        bars.add(3);
        bars.add(7);
      System.out.println( max_water_finder(bars)); 

    }
}
