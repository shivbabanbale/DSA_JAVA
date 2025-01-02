public class last_occurence {

    public static int last_index(int arr[], int key,int i) {
if(i==arr.length){

    return -1;
    
}
int isfound=last_index(arr, key,i+1);

if(isfound==-1 && arr[i]==key){

    return i;
}







return last_index(arr, key, i+1);

    }

public static void main (String args[]){

            int arr[]={1,9,6,7,8,2,5,6,3};
            int key=6;
            int i =0;
       System.out.println(last_index(arr,key,i));  




    }
}
