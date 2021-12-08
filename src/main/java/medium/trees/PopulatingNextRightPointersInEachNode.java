package medium.trees;

import common.helper_classes.Node;

import java.util.ArrayList;
import java.util.LinkedList;

//116. Populating Next Right Pointers in Each Node (Medium)
public class PopulatingNextRightPointersInEachNode {

	public Node connect(Node root) {
		if (root == null) {
			return null;
		}

		LinkedList<Node> list = new LinkedList<>();
		list.add(root);

		LinkedList<ArrayList<Node>> nList = new LinkedList<>();

		while (!list.isEmpty()) {
			ArrayList<Node> nodes = new ArrayList<>();

			int size = list.size();
			int i = 0;

			while (i++ < size) {
				Node node = list.pop();

				if (node.left != null) {
					list.add(node.left);
					nodes.add(node.left);
				}
				if (node.right != null) {
					list.add(node.right);
					nodes.add(node.right);
				}
			}

			if (!nodes.isEmpty()) {
				nList.add(nodes);
			}
		}

		for (ArrayList<Node> node : nList) {
			for (int i = 1; i < node.size(); i++) {
				node.get(i - 1).next = node.get(i);
			}
		}

		return root;
	}

}
