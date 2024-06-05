import java.util.*;
public class java_half_pyramid_pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); //number of lines

        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();

        }
   
    }
    }