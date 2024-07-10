import java.util.*;
public class java_best_time_to_buy_stocks{
    public static int buyandsellstocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){              //profit
                int profit = prices[i]-buyPrice;   //today's profit
                maxprofit=Math.max(maxprofit,profit);
            }   
            else{
                buyPrice = prices[i];
            }

        }
        return maxprofit;
    }
    
    public static void main(String[] args){
    int prices[] = {7,1,5,3,6,4};
    System.out.println(buyandsellstocks(prices));
    }}