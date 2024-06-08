public class LargestLocalValuesInAMatrix {

    public static void main(String[] args){
        int[][] arr = {{20,8,20,6,16,16,7,16,8,10},{12,15,13,10,20,9,6,18,17,6},{12,4,10,13,20,11,15,5,17,1},{7,10,14,14,16,5,1,7,3,11},{16,2,9,15,9,8,6,1,7,15},{18,15,18,8,12,17,19,7,7,8},{19,11,15,16,1,3,7,4,7,11},{11,6,5,14,12,18,3,20,14,6},{4,4,19,6,17,12,8,8,18,8},{19,15,14,11,11,13,12,6,16,19}};

        int[][] r =new LargestLocalValuesInAMatrix().largestLocal(arr);
        System.out.print("{");
        for (int i = 0; i < r.length; i++) {
            System.out.print("{");
            for (int j = 0; j < r.length; j++) {
                System.out.print(r[i][j]+",");
            }
            System.out.print("}");
        }
        System.out.print("}");
    }
    public int[][] largestLocal(int[][] grid) {
        int[][] arr = new int[grid.length-2][ grid.length-2];
        for (int i = 0; i < grid.length-2; i++) {
            for (int j = 0; j < grid.length-2; j++) {
                arr[i][j] = findMax(grid,i,j);
            }
        }
        return arr;
    }
    private int findMax(int[][] grid, int i, int j) {
        int max = Integer.MIN_VALUE;
       for (int j2 = i; j2 < i+3; j2++) {
            for (int k = j; k < j+3; k++) {
                max =Math.max(max, grid[j2][k]);
            }
       }
       return max;
    } 
}
