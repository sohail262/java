import java.util.*;
public class java_factorial{
    public static void main(String[] args){
        int i;
        int n=4;
         int fact=1;
        for(i=1;i<=n;i++){
            fact*=i;
        }
            System.out.println(fact);        
    }
}