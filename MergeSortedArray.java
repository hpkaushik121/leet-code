public class MergeSortedArray {

    public static void main(String[] args){
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+", ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int arr2[] = nums1.clone();
        int i=0,j=0;
        for (int k = 0; k < arr2.length; k++ ) {
            if(nums2.length==0 ||nums2.length -1 < j || (arr2[i]<=nums2[j] && (arr2[i] !=0 || i<m))){
                nums1[k] = arr2[i];
                i++;
            }else{
                nums1[k] = nums2[j];
                j++;
            }
        }
       
    }
}
