package adhoc;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class BFs {

	Queue<Node> printBFS(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.println("------->" + tempNode.data);

			if (tempNode.left != null)
				queue.add(tempNode.left);

			if (tempNode.right != null)
				queue.add(tempNode.right);
		}
		return queue;

	}

	public static void main() {
		Node tree_level = new Node(1);
		tree_level.left = new Node(2);
		tree_level.right = new Node(3);
		tree_level.left.left = new Node(4);
		tree_level.left.right = new Node(5);
	}

}
