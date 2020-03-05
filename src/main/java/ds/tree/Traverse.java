package ds.tree;

public class Traverse {
 static int i=0;
	public void inorder(TreeNode node) {
		if (node == null)
			return;
		inorder(node.left);
		System.out.println(node.data);
		i++;
		System.out.println("i "+i);
		inorder(node.right);

	}

	public void preorder(TreeNode node) {
		if (node == null)
			return;
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);

	}
}
