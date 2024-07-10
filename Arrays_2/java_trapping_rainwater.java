public class java_trapping_rainwater{
   public static int trappedRainwater(int height[]){
    int n = height.length;
    //calculate left max boundary - array
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];  //initially the height for first bar will be itself
    for(int i=1;i<n;i++){
        leftMax[i]=Math.max(height[i],leftMax[i-1]);  //then compare each bar and the previous bar's maximum value
    }
    //calculate right max boundary - array
    int rightMax[]=new int[n];
    rightMax[n-1]=height[n-1];  //initially the height for the last bar will be itself
    for(int i=n-2;i>=0;i--){  //for iterating the loop in reverse way
        rightMax[i]=Math.max(height[i],rightMax[i+1]);   //then compare the bars reverse manner and the next bars maximum value
    }
    int trappedWater=0;  //initially 0
    //loop
    for(int i=0;i<n;i++){
        int waterlevel = Math.min(leftMax[i],rightMax[i]);    //get the minimum value from the leftMax array and rightMax array
        //waterlevel = min
        trappedWater=trappedWater+waterlevel-height[i];  //trapped water's formula
    }
    return trappedWater;
   }
   
    public static void main(String[] args){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}