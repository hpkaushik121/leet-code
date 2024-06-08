public class MatrixDiagonalSum {

    public static void main(String[] args){
        int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
        
        System.out.println(new MatrixDiagonalSum().diagonalSum(arr));
    }

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int i = 0;
        int j =0;
        int k = 0;
        int l = mat.length-1;
        while (i < mat.length) {
            sum += mat[i][j];
            i++;
            j++;
            if(k!=l){
                sum += mat[k][l];
            }
            
            k++;
            l--;
        }

        return sum;
    }
}
