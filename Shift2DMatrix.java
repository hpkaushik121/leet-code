import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shift2DMatrix {
    public static void main(String[] args){
        System.out.println(new Shift2DMatrix().shiftGrid(null, 0));
    }
    /**
     * Pair
     */
    public class Pair {
        int i;
        int j;
        public Pair(int i,int j){
            this.i = i;
            this.j = j;
        }
    }
    HashMap<Integer,Pair> map = new HashMap<>();
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int p = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                map.put(p, new Pair(i, j));
                p++;
            }
        }
        p=1;
        int arr[][] = new int[grid.length][grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                Pair pair = findPair(p,k,grid.length);
                arr[pair.i][pair.j] = grid[i][j];
                p++;
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                innerList.add(arr[i][j]);
            }
            list.add(innerList);
        }
        return list;

    }
    private Shift2DMatrix.Pair findPair(int p, int k,int l) {
        int n = p+k;
        if(n>l){
            n = n-l;
        }
        return map.get(n);
    }
}
