public class Buy_sell_share {
    public static int profitmaker(int arr[]) {
        int lowestprice = Integer.MAX_VALUE;
        int greatestprice = Integer.MIN_VALUE;
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (lowestprice > arr[i]) {
                lowestprice = arr[i];
                l++;
            }
        }

        System.out.println("the lowest price of stock you want to buy " + lowestprice);
        for (int i = l + 1; i < arr.length; i++) {
            if (arr[i] > greatestprice) {
                greatestprice = arr[i];
            }
        }
        System.out.println("the greatest price of stock is " + greatestprice);
        if (greatestprice < lowestprice) {
            return 0;
        } else {
            int profit = greatestprice - lowestprice;
            return profit;
        }

    }

    public static void main(String argd[]) {

        int arr[] = {  1,8, 9, 6, 3, 4, 5 };
        int profit = profitmaker(arr);
        System.out.println(" profit hogaya bhai , NACHO -----> " + profit);

    }
}
