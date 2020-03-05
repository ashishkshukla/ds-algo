package ds.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopView {
	class QueObj {
		int distance;
		TreeNode node;

		public QueObj(TreeNode node, int distance) {
			this.node = node;
			this.distance = distance;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.left.right = new TreeNode(8);
		root.right.right.right = new TreeNode(9);
		root.right.right.left = new TreeNode(10);
		root.right.right.left.right = new TreeNode(11);
		root.right.right.left.right.right = new TreeNode(12);
		new TopView().printTopView(root);
	}

	public void printTopView(TreeNode root) {

		Map<Integer, TreeNode> map = new HashMap<Integer, TreeNode>();
		Queue<QueObj> queue = new LinkedList<TopView.QueObj>();
		if (root != null) {
			queue.add(new QueObj(root, 0));
		}

		while (!queue.isEmpty()) {
			QueObj tempQueObj = queue.poll();

			if (null == tempQueObj.node)
				continue;

			if (!map.containsKey(tempQueObj.distance))
				map.put(tempQueObj.distance, tempQueObj.node);
			queue.add(new QueObj(tempQueObj.node.left, tempQueObj.distance - 1));
			queue.add(new QueObj(tempQueObj.node.right, tempQueObj.distance + 1));
		}

		for(Integer key:map.keySet()){
			System.out.print(map.get(key).data+" ");
		}
	}
}
