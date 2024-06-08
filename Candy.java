public class Candy {
    public static void main(String[] args){
        int[] rating={1,0,2};
        int k = new Candy().candy(rating);
        System.out.println(k);
    }

    public int candy(int[] ratings){
       int counter =1;
        int[] candys = new int[ratings.length];
        candys[0] =1;
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i-1]>ratings[i]){
               int j = i;
               counter = addToCount(candys,i,1,counter);
               while (j>0) {
                if(ratings[j-1]<=ratings[j] || candys[j-1]> candys[j]){
                    break;
                }
                j--;
                counter = addToCount(candys,j,candys[j]+1,counter);
               }

            }else if(ratings[i-1]<ratings[i]) {
               counter = addToCount(candys,i,candys[i-1]+1,counter);
                
            }else if (ratings[i-1]==ratings[i]){
               
                counter = addToCount(candys,i,1,counter);
            }
            
            
        }
       
        return counter;
    }
    public int addToCount(int[] candys,int i , int val, int counter){
        int temp = candys[i];
        candys[i] = val;
        counter = counter - temp + val;
        return counter;
    }
}
