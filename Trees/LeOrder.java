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
public class LeOrder{
int count;
    TreeNode root;
  public  void insert(int data){
    root = insertRec(root, data);   
   }
//recursive insert search bst like and insert 
    public TreeNode insertRec(TreeNode root, int data){
        if(root == null){
            root = new TreeNode(data);
        }
        if(data < root.data){
            root.left= insertRec(root.left, data);
        }
        if(data > root.data){
            root.right= insertRec(root.right, data);
        }
        return root;
    } 

    //now tree creation complete level order 
   public  void Level(TreeNode root){
        
        Queue<TreeNode> q=new LinkedList<>(); 

        q.add(root);
        if(root == null){
            return;
        }
        while(!q.isEmpty()){
            count =count +1;
            TreeNode current = q.poll();
            System.out.print(current.data);

            if(current.left !=null){
                 
                q.add(current.left);
                
            }
            if(current.right !=null){
                 
                q.add(current.right);
            }
        }

    }


    public static void main(String args[]){
        /*
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
        */
       LeOrder bst =new LeOrder();

       bst.insert(4);
       bst.insert(2);
       bst.insert(6);
       bst.insert(1);
       bst.insert(3);
       bst.insert(5);
       bst.insert(8);
        bst.Level(bst.root);

System.out.println(bst.count);


    }

}
