package Trees;
//Inorder , Preeorder, postorder.
public class DEF {
    static void  Inorder(TreeNode root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);

    }
    public static void main(String args[]){
        DEF def=new DEF();
        Tree bst = new Tree();


       // Inorder(Tree.bst.root);

    }
    
}
