package com.gl.javafsd.dsa.mncbstmodification;

import com.gl.javafsd.dsa.mncbstmodification.MNCBSTModification.Node;

public class DriverClass {

	public static void main(String[] args) {
		MNCBSTModification tree = new MNCBSTModification();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		
		// Convert BST to skewed tree
		Node skewedRoot = tree.convertToSkewed(tree.node);

		// Display nodes in ascending order
		tree.displayAscending(skewedRoot);
	}
}
