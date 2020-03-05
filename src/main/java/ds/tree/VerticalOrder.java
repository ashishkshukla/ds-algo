package ds.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class VerticalOrder {
	class QueueObj {
		int distance;
		TreeNode node;

		public QueueObj(TreeNode node, int distance) {
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
		new VerticalOrder().verticalTraverse(root);
	}

	public void verticalTraverse(TreeNode root) {
		Map<Integer, List<TreeNode>> map = new HashMap<Integer, List<TreeNode>>();
		Queue<QueueObj> queue = new LinkedList<QueueObj>();
		traverse(root, map, queue);
		
		Set<Integer> keyset=map.keySet();
		for(Integer key: keyset){
			List<TreeNode> nodes=map.get(key);
			for(TreeNode node: nodes){
				System.out.print(node.data+" ");
			}
			System.out.println();
		}

	}

	public void traverse(TreeNode node, Map<Integer, List<TreeNode>> map, Queue<QueueObj> queue) {

		if (node != null) {
			queue.add(new QueueObj(node, 0));
		}

		while (!queue.isEmpty()) {

			QueueObj tempNodeObj = queue.poll();
			if(null ==tempNodeObj.node)
		     continue;
			List<TreeNode> coveredNodes = map.get(tempNodeObj.distance);

			if (null == coveredNodes) {
				List<TreeNode> newList = new ArrayList<TreeNode>();
				newList.add(tempNodeObj.node);
				map.put(tempNodeObj.distance, newList);
			} else {
				coveredNodes.add(tempNodeObj.node);
			}
			queue.add(new QueueObj(tempNodeObj.node.left,tempNodeObj.distance-1));
			queue.add(new QueueObj(tempNodeObj.node.right,tempNodeObj.distance+1));
		}

	}
}
