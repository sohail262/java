import java.util.*;
//Brute Force method 
//Time complexity is - Big O(n cube)

public class java_max_subarray_sum{
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10};
        
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                int currSum=0;
                for(int k=start;k<=end;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum of subarray is "+""+ maxSum);
        }
    }
