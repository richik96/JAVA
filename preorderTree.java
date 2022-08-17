import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class solution{
    public ArrayList<Integer> preorderTree(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        //Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode current;
        current = A;
        while(current != null) {
            if(current.left == null) {
                res.add(current.val);
                current = current.right;
            }
            else {
                TreeNode prev = current.left;
                while(prev.right!=null && prev.right != current) {
                    prev = prev.right;
                }
                if(prev.right == null) {
                    prev.right = current;
                    res.add(current.val);
                    current = current.left;
                }
                else {
                    prev.right = null;
                    current = current.right;
                }
            }
        }
        return res;
    }
}

public static void main(String[] args) {
    
}