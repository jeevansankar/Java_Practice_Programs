package Trees;
import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right; 
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }   
}
// basic tree creation
public class Tree {

   TreeNode root;
   void insert(int data){
    root = insertRec(root, data);   
   }
    public TreeNode insertRec(TreeNode root, int data){
        if(root == null){
            root = new TreeNode(data);
        }
        if(data < root.data){
            root.left= insertRec(root.left, data);
        }
        if(data > root.data){
            root.left= insertRec(root.right, data);
        }
        return root;
    } 

    public  void  Inorder(TreeNode root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);

    }



    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Tree bst=new Tree();
    System.out.println("Enter binary search treee nodes");
    for(int i=0;i< 7; i++){
    int data=sc.nextInt();
     bst. insert(data);
    bst.Inorder(bst.root);
    }


    

}
}
