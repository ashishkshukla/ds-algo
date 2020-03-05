package ds.tree;

public class LevelOrderTraverse {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(6);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(11);
		root.right.right.left = new TreeNode(12);
		Traverse tr = new Traverse();
		// tr.inorder(root);
		LevelOrderTraverse lot = new LevelOrderTraverse();
		System.out.println(lot.getHeight(root));
		lot.levelOrderTraverse(root);

	}

	public int getHeight(TreeNode node) {
		if (node == null)
			return 0;
		int lheight = getHeight(node.left);
		int rheight = getHeight(node.right);
		if (lheight > rheight)
			return ++lheight;
		else
			return ++rheight;

	}

	public void levelOrderTraverse(TreeNode node) {
		for (int i = 1; i <= getHeight(node); i++) {
			levelOrderPrint(node, i);
		}
	}

	public void levelOrderPrint(TreeNode node, int level) {
		if (node == null)
			return;
		if (level == 1)
			System.out.println(node.data);
		else {
			levelOrderPrint(node.left, level - 1);
			levelOrderPrint(node.right, level - 1);
		}
	}
}
