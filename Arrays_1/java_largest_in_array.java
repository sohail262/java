import java.util.*;
public class java_largest_in_array{
    public static void main(String[] args){
        int array[]={2,3,21,54,23,40};
        int largest=Integer.MIN_VALUE;  // minus infinity
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
            }
        System.out.println("Largest value is = "+ largest);
        
         int smallest = Integer.MAX_VALUE; //positive infinity
        for(int j=0;j<array.length;j++){
            if(smallest>array[j]){
                smallest=array[j];
            }
        }
        System.out.println("Smallest value is= "+ smallest);
}
    } 
