//sub array should be continuos
public class java_sub_array{
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10};
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;i<numbers.length;j++){
                int end=j;
                for(int k=start;k<end;k++){    //printing loop
                    System.out.print(numbers[k]+" "); //sub array
                }
                System.out.println();
            }
           System.out.println();
        }
         
    }
}