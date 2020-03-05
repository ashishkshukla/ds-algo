package ds.tree;


public class MakeTree {

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(2);
		tn.left = new TreeNode(1);
		tn.right = new TreeNode(3);
		tn.left.left = new TreeNode(5);
		tn.left.right = new TreeNode(6);
		tn.right.left = new TreeNode(7);
		tn.right.right = new TreeNode(8);
		Traverse traverseTree = new Traverse();
		traverseTree.inorder(tn);
	}

}
