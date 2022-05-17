package binaryTree;

public class Main {

	public static void main(String[] args) {
		 /* create a tree */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
          
        /* get leaf count of the above tree */
        System.out.println("The leaf count of binary tree is : "
                             + tree.getLeafCount());
	}

}
