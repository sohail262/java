import java.util.*;

public class java_array_input_output{
    public static void main(String[] args){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

         marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
         marks[2]=sc.nextInt();

        System.out.println("marks of sub 1:"+ marks[0]);        
        System.out.println("marks of sub 2:"+ marks[1]);        
        System.out.println("marks of sub 3:"+ marks[2]);        
        System.out.println("Length of the array is"+ marks.length);
    }
}