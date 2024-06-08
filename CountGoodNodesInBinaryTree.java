import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// BinaryTree class to perform DFS
public class CountGoodNodesInBinaryTree {
    static int count = 0;
    static void printSum(TreeNode node,int sum, List<Integer> list) {
        if (node == null) {
            return ;
        }
        List<Integer> newList = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"->");
        }
        System.out.println(node.data);
        newList.add((Integer) node.data);
        getSum(newList,sum);
        // Recur on the left child
        printSum(node.left,sum,newList);

        // Recur on the right child
        printSum(node.right,sum,newList);
    }
    static void getSum(List<Integer> list,int sum){
       int i =0;
       while (i<list.size() && list.get(i)>sum){
           i++;
       }
       if(i<list.size() &&list.get(i) == sum){
           count++;
       }
       int j = i+1;

        while (j<list.size() &&list.get(j)>sum){
            j++;
        }
        if((j<list.size() && list.get(j) == sum)){
            count++;
        }
        int max = list.get(i);
       while (j<list.size() && i<j){
            max += list.get(j);
           if(max<sum){
               j++;
           }
           else if(max>sum){
               max -= list.get(i);
               i++;
           }else{
               count++;
               break;
           }

       }
    }


    // Main method to test the DFS traversal
    public static void main(String[] args) {
        ArrayToBinaryTree tree = new ArrayToBinaryTree();
        Object[] arr = {5,4,8,11,null,13,4,7,2,null,null,5,1};
        TreeNode root = ArrayToBinaryTree.insertLevelOrder(arr, null, 0);
        printSum(root,22,new ArrayList<>());
        System.out.println(count);
    }
}
