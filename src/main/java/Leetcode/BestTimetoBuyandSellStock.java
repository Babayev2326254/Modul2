package Leetcode;

public class BestTimetoBuyandSellStock {
    public int maxProfit2(int[] prices) {
        int price = 0;
        int min = prices[0];
        int index = 0;
//        int[] arr = prices;
//        Arrays.sort(prices);
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }


        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                index = i;
            }
        }
        System.out.println(min);


        int max = prices[index];
        if (min != prices[prices.length - 1]) {
            for (int j = index; j < prices.length; j++) {
                if (prices[j] > max) {
                    max = prices[j];
                }
            }
            price = max - min;
        } else if (max == prices[0]) {
            price = 0;
        }
        System.out.println(max);

        System.out.println(price);

        return price;
    }

    public int maxProfit(int[] prices) {
        int price = 1;
        int a;
        int price2 = 0;
        double b = 0;


        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j < prices.length - 1; j++) {
                if (prices[i] - prices[j] > 0) {
                    a = prices[i] - prices[j];
                    if (a > price2) {
                        price2 = a;
                    }
                } else if (prices[i] < prices[j]) {
                    b++;

                }
            }
        }
        System.out.println(b);
        b = b / 2;
        if (b != prices.length) {
            price = price2;
        } else {
            price = 0;
        }

        System.out.println(price);
        return price;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock obj = new BestTimetoBuyandSellStock();
        obj.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        obj.maxProfit(new int[]{7, 6, 4, 3, 1});
        obj.maxProfit(new int[]{2, 1, 2, 0, 1});
    }
}
