public class TrappingRainWater {
    public static void main(String[] args){
        int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
        new TrappingRainWater().trap(height);
    }
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
             return 0;
         }
 
         int left = 0, right = height.length - 1;
         int leftMax = height[left];
         int rightMax = height[right];
         int waterTrapped = 0;
 
         while (left < right) {
             if (leftMax < rightMax) {
                 left++;
                 System.out.print("left=>"+left+"\n");
                 System.out.print("leftMax("+leftMax+","+height[left]+")=>");
                 leftMax = Math.max(leftMax, height[left]);
                 System.out.print(leftMax+"\n");
                 waterTrapped += leftMax - height[left];
                 System.out.print("WaterTraped=>"+waterTrapped+"\n");
             } else {
                 right--;
                 System.out.print("right=>"+right+"\n");
                 System.out.print("rightMax("+rightMax+","+height[right]+")=>");
                 rightMax = Math.max(rightMax, height[right]);
                 System.out.print(rightMax+"\n");
                 waterTrapped += rightMax - height[right];
                 System.out.print("WaterTraped=>"+waterTrapped+"\n");
                 
             }
         }
 
         return waterTrapped; 
     }
}
