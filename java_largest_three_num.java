import java.util.*;
public class java_largest_three_num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A>B && A>C){
            System.out.println("Largest is A"+A);
        }
        else if(B>C && B>A){
            System.out.println("Largest is B"+B);
        }
        else{
            System.out.println("Largest is C"+C);
        }
    }
}