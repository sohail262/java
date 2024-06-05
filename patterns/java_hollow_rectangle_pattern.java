import java.util.*;
public class java_hollow_rectangle_pattern{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int totalRows=sc.nextInt();
        int totalCols=sc.nextInt();
        
        //outer loop
        for(int i=1; i<=totalRows;i++){
            //inner loop
            for(int j=1;j<=totalCols;j++){
                if(i==1 || i==totalRows || j==1 || j==totalCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}