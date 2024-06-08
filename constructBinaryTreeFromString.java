import java.util.Stack;

public class constructBinaryTreeFromString {
    public static TreeNode str2tree(String s) {
        if (s == null || s.length() == 0) return null;
        Stack<TreeNode> stack = new Stack<>();
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == ')') {
                stack.pop();
                i++;
            } else if (s.charAt(i) == '(') {
                i++;
            } else {
                int start = i;
                if (s.charAt(i) == '-') i++;
                while (i < s.length() && Character.isDigit(s.charAt(i))) i++;
                int val = Integer.parseInt(s.substring(start, i));
                TreeNode node = new TreeNode(val);
                if (!stack.isEmpty()) {
                    TreeNode parent = stack.peek();
                    if (parent.left == null) {
                        parent.left = node;
                    } else {
                        parent.right = node;
                    }
                }
                stack.push(node);
            }
        }
        return stack.isEmpty() ? null : stack.get(0);
    }
    public static void main(String[] args) {
        String s= "4(2(3)(1))(6(5))";
        str2tree(s);
    }
}
