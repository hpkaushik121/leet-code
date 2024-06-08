public class FlippinAnImage {
    public static void main(String[] args){
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] r = new FlippinAnImage().flipAndInvertImage(arr);
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
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image.length];
        for (int i = image.length-1; i >=0; i--) {
            for (int j = 0; j < image.length; j++) {
                arr[(image.length-1)-i][j] = image[i][j] == 1 ? 0: 1;
            }
        }
        return arr;
    }
}
