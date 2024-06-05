public class java_if_else{
    public static void main(String[] args){
        int x=18;
        int age=21;
        if(age>x){
            System.out.println("you are eligible to vote");
        }
        if(age>23){
            System.out.println("you are eligible for job");
        }


        int time=20;
        if(time<18){
            System.out.println("Good day");
        }
        else{
            System.out.println("good evening");
        }

        //Short hand if else
        int pass=40;
        int marks=41;
        String result=(marks<pass)? "fail" : "pass";
        System.out.println(result);
    }
}