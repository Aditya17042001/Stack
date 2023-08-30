/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list =new ArrayList<Integer>(); // to store the traversal result
        Stack<TreeNode> stack=new Stack<TreeNode>();  //to make a depth first search
        TreeNode cur=root; 
        while(cur!=null||!stack.empty()){
            while(cur!=null){ // go to the extreme left
            stack.add(cur); //add all the left nodes in stack 
            cur=cur.left;
            }
        
        cur=stack.pop(); // pop the first element
         list.add(cur.val); // add to the list.since (LEFT-ROOT-RIGHT)
        cur=cur.right; // Repeat the same for the right subtree
    }
    return list;
    }
}
