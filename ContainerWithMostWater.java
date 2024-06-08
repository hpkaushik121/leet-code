public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] area = {1,2};
        System.out.println(new ContainerWithMostWater().maxArea(area));
    }

    public int maxArea(int[] height) {
       int waterTrapped = 0;
       int i=height.length-1;
       int j=0;
       while (i!=0) {
        while(height[i]>height[j]){
            j++;
        }
        int water = height[i]*(i-j);
        if(waterTrapped<water){
            waterTrapped = water;
        }
        i--;
        
       }
       i=height.length-1;
       j=0;
       while (j<height.length) {
        while(height[i]<height[j]){
            i--;
        }
        int water = height[j]*(i-j);
        if(waterTrapped<water){
            waterTrapped = water;
        }
        j++;
        
       }

        return waterTrapped; 
    }
        
    
}
