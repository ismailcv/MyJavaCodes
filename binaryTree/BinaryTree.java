package binaryTree;

public class BinaryTree {
	//Root of the Binary Tree
    Node root;
      
    /* Function to get the count of leaf nodes in a binary tree*/
    int getLeafCount(){
        return getLeafCount(root);
    }
  
    int getLeafCount(Node node){
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);

    }
}
