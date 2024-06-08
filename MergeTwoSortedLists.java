public class MergeTwoSortedLists {
    public static void main(String[] args){
        int[] arr1= {1,1,2};
        int[] arr2= {3,4,4};
        ListNode head1 = null;
        ListNode head2 = null;
        for (int i = 0; i < arr1.length; i++) {
            ListNode newNode = new ListNode(arr1[i]);
            newNode.next = head1;
            head1 = newNode;
        }
        for (int i = 0; i < arr2.length; i++) {
            ListNode newNode = new ListNode(arr2[i]);
            newNode.next = head2;
            head2 = newNode;
        }
        ListNode megedList = new MergeTwoSortedLists().mergeTwoLists(head1,head2);
        while (megedList!=null) {{
            System.out.print(megedList.val+",");
            megedList = megedList.next;
        }
            
        }

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        return MergeTwoSortedLists(null,list1,list2);
        

    }

    private ListNode MergeTwoSortedLists(ListNode head, ListNode list1, ListNode list2) {
        if((list2 ==null && list1!=null)  || (list1!=null && list1.val > list2.val)){
            ListNode newNode = new ListNode(list1.val);
            newNode.next = head;
            head = newNode;
            return MergeTwoSortedLists(head, list1.next, list2);
        }
        if((list1 ==null && list2 !=null )|| ( list2 !=null && list2.val > list1.val)){
            ListNode newNode = new ListNode(list2.val);
            newNode.next = head;
            head = newNode;
            return MergeTwoSortedLists(head, list1, list2.next);
        }
        return head;
    }
  
}


