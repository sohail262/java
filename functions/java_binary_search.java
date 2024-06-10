import java.util.*;
public class java_binary_search{
public static void main(String[] args){
    int array[]={2,4,6,8,10,12,14};
    int key=8;
    int mid=(array.length)/2;
    // mid value 
    if(key==array[mid]){
        System.out.println("value is at mid"+ mid);
        return;
    }
    // left side of array condition
        if(key<array[mid]){
            for(int j=0;j<mid;j++){
                if(array[j]==key){
                    System.out.println("value is at"+ j);
                    return;
                }
            }
        }
        //right side of array condition
        else if(key>array[mid]){
            for(int j=mid+1;j<array.length;j++){
                if(array[j]==key){
                    System.out.println("value is at index" + j);
                    return;
                }
            }
        }
         System.out.println("value not found");
        
}}