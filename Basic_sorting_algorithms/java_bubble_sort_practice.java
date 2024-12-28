public class java_bubble_sort_practice {
    public static void main(String[] args){
        int arr[]={5,32,62,2,1,3};
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
