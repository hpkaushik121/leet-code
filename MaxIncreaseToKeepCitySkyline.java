public class MaxIncreaseToKeepCitySkyline {
    public static void main(String[] args){
        int[][]  grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(new MaxIncreaseToKeepCitySkyline().maxIncreaseKeepingSkyline(grid));
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int west[] = new int[grid.length];
        int south[] = new int[grid.length];

        for (int i = west.length-1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for (int j = 0; j < west.length; j++) {
                max = Math.max(max, grid[i][j]);
                max2 = Math.max(max2, grid[j][i]);
            }
            west[i] = max;
            south[i] = max2;
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int val = Math.min(west[i],south[j]);
                sum += val-grid[i][j];
            }
        }
        return sum;


    }
}
