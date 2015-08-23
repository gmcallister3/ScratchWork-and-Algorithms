//Find all paths in a binary tree that add up to a given sum
//Given a tree like this:
 	// 		2
 	//   3	     5
 	// 4   8   6   -2
 	//                 2
import java.util.Stack;

public class sumPath {

	private class Node {

		private int value;
		private Node left, right;

		public Node(int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}



	public static void main(String[] args) {
		//Test cases
		Node root = new Node(2, new Node(3, new Node(4, null, null), new Node(8, null, null),
		                     new Node(5, new Node(6, null, null), new Node(-2, null, new Node(2, null, null)))));
		System.out.println(sumPaths(root, 7, 0));
	}

	public static int[] sumPaths(Node root, int reqSum, int curSum) {
	//DFS and terminate when sum > reqSum or sum == reqSum && leaf node
		Stack st = new Stack();
		st.push(root);
		while (!st.isEmpty()) {
			curSum += root.value;
			//Add children
			if (root.right != null) {
				st.push(root.right);			
			}
			if (root.left != null) {
				st.push(root.left);
			}
			//If curSum has been met and leaf node, print nodes
			if (curSum == reqSum && root.right == null && root.left == null) {

			}
			root = st.pop();
		}
		


	}
}