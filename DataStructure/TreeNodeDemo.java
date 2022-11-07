public class TreeNodeDemo {
    public static void main(String[] args) {
        TreeNodeDemo tr = new TreeNodeDemo();
        tr.addNode();
        tr.inOrderTraversal(tr.root);
    }
    class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public TreeNode root;
    public void addNode(){
        TreeNode treeNode1 = new TreeNode(12);
        TreeNode treeNode2 = new TreeNode(13);
        TreeNode treeNode3 = new TreeNode(14);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(16);
        root=treeNode1;
        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        treeNode2.left=treeNode4;
        treeNode2.right=treeNode5;
    }
    public void inOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

}
