import java.util.*;

public class TheEarliestMoment {
    static HashMap<Integer, Integer> representative = new HashMap<>();
    static HashMap<Integer, Integer> sizes = new HashMap<>();
    public static void main(String[] args) {
        int logs[][] = {{7,3,1},{2,3,0},{3,2,1},{6,0,1},{0,2,0},{4,3,2}};
        int n = 4;

        Arrays.sort(logs, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < n; i++) {
            representative.put(i,i);
            sizes.put(i,1);

        }
        int sol = -1;
        for (int i = 0; i < logs.length; i++) {
            int t = logs[i][0];
            int f1 = logs[i][1];
            int f2 = logs[i][2];
            int rep = find(f1);
            int rep2 = find(f2);
           if(rep != rep2){
               int size = sizes.get(rep);
               int size2 = sizes.get(rep2);
               representative.put(rep2,rep);
               sizes.put(rep,size+size2);
               if(size2+size == n){
                   sol = t;
                   break;
               }
           }

        }
        System.out.println(sol);
    }
    public static int find(int fr){
        int f1 = representative.get(fr);
        if(f1 == fr){
            return f1;
        }
        return find(f1);
    }
}
