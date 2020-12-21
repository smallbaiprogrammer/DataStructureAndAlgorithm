package test;
public class test{
    public boolean judge(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while(!queue.isEmpty()) {
            root = queue.remove();
            if(root == null){
                if(flag){
                    return false;
                }else{
                    false = true;
                }
            }
            queue.add(root.left);
            queue.add(root.right);
        }  
        return true;
    }
}