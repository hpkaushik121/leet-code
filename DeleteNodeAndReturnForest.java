import java.util.ArrayList;
import java.util.List;


public class DeleteNodeAndReturnForest {

  

  public static void main(String[] args){
    int[] to_delete ={3,5};
    TreeNode head = null;
    TreeNode tail = null;
    int[] root = {2,1,3,1,4,5,6,7};
    boolean left= true;
    for (int i = 0; i < root.length; i++) {
        head = insertRec(head,root[i]);
    }
    System.out.println(new DeleteNodeAndReturnForest().delNodes(head, to_delete));
  }
     private static TreeNode insertRec(TreeNode head, int i) {
        if (head == null) {
            head = new TreeNode(i);
            return head;
        }
 
        // Otherwise, recur down the tree
        else if (i < head.val)
            head.left = insertRec(head.left, i);
        else if (i > head.val)
            head.right = insertRec(head.right, i);
        return head;
}
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list = new ArrayList<>();
        for (int item : to_delete) {
            list.addAll(deletNode(root,item,list));
            
        }
       
        return list;
    }
    private List<TreeNode> deletNode(TreeNode root, int item,List<TreeNode> delList) {
        if(root!=null && root.val==item){
            delList.add(root.left);
            delList.add(root.right);
            root =null;
        }
        if(root!=null){
            deletNode(root.left, item, delList);
            deletNode(root.right, item, delList);
        }
        return delList;
    }
    
}
