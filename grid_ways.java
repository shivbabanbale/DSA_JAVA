public class grid_ways {

public static int  ways_finder(int i,int j,int row ,int column){

if(i==row-1 && j==column-1){
return 1;
}if(i==row || j==column){

    return 0;
}

int way1=ways_finder(i+1, j, row, column);
int way2=ways_finder(i, j+1, row, column);

return way1+way2;

}


    public static void main(String args[]){
            int m=4,n=4;
           System.out.println(ways_finder(0,0,m,n)); 

    }
}
