import java.util.*;
public class java_linear_search{
    public static void main(String[] args){
        int array[] = {2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                System.out.println(i);
            }
        }
    }
}