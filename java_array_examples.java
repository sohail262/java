public class java_array_examples{
    public static void main(String[] args){
        int ages[]={20,22,18,35,48,26,87,70};
        float avg,sum=0;

        //get the length of the array
        int length=ages.length;

        //loop through the elements of the array
        for(int age:ages){
            sum=sum+age;
        }
        avg=sum/length;
        System.out.println(avg);
    }
}