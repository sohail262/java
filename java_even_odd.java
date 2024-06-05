import java.util.*;
public class java_even_odd{
    public static void main(String[] args){
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        int even=0;
        int odd=0;
        if(number%2==0){
            even+=number;
            System.out.println(even);
        }
        else{
            odd+=number;
            System.out.println(odd);
        }
    }
}