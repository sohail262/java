import java.util.*;
public class java_character_pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        char ch='A';
        
        //outer loop
        for(int line=1;line<=n;line++){
            //inner loop
            for(int characters=1; characters<=line;characters++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        
        }
        
        
        
        }