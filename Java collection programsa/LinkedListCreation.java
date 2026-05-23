class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class LinkedListCreation {
    Node root;
    Node current;
    void addNode(int data){
        if(root == null){
            root=new Node(data);
        }

        else{
            current = root;
            
            while(current!=null){
                current=current.left; 
            }
            current.left=new Node(data);

        }
        while(root!=null){
            System.out.println(root.data);
            root=root.left;
        }

    }
    

    public static void main(String [] args){
        LinkedListCreation list=new LinkedListCreation();
        list.addNode(1);
        list.addNode(4);


    }
}
