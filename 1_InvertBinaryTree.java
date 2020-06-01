class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode inv=null;
        return ret(root,inv);    
    }
    
    TreeNode ret(TreeNode root,TreeNode temp)
    {
        if(root==null)
            return null;
        temp=new TreeNode(root.val);
        temp.right=ret(root.left,temp.right);
        temp.left=ret(root.right,temp.left);
        return temp;
    }
}
