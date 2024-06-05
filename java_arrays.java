public class java_arrays{
    public static void main(String[] args){
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        //Array length
        System.out.println(cars.length);

        //iterate java through loop
        for(int i=0; i<cars.length;i++){
            System.out.println(i);
        }

    
        for(String j : cars){
            System.out.println(j);
        }

    }
}