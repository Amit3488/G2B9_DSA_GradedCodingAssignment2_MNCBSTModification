package com.gl.javafsd.dsa.mncbstmodification;

public class MNCBSTModification {
	static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	Node node;

	// Right rotation function
	private Node rightRotate(Node node) {
		Node newNode = node.left;
		if (newNode == null) {
			return node;
		}
		node.left = newNode.right;
		newNode.right = node;
		return newNode;
	}

	// Function to convert BST to skewed tree
	Node convertToSkewed(Node root) {
		if (root == null) {
			return null;
		}

		// Convert left subtree
		root.left = convertToSkewed(root.left);

		// Rotate right at each node
		root = rightRotate(root);

		// Convert right subtree
		root.right = convertToSkewed(root.right);

		return root;
	}

	// Function to display nodes in ascending order
	void displayAscending(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");

		displayAscending(root.right);
	}
}