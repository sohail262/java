public class java_array_examples_1{
    public static void main(String[] args){
        int ages[]={20,22,18,35,448,26,87,70};
        float avg,sum=0;
        int length=ages.length;
        int lowest_age=ages[0];
        for(int age:ages){
            if(lowest_age>age){
                lowest_age=age;
            }
           
        }
         System.out.println("Lowest age from the array is"+"  "+lowest_age);
    }
}