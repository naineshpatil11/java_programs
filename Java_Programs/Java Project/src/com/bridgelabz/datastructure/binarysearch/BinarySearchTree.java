package com.bridgelabz.datastructure.binarysearch;

public class BinarySearchTree
{
	Node root;
	Node node;
	 
	void insert(int key)
	{
		root = insertRec(root,key);
	}
	
	//to add at appropriate position
	//recursive function to insert a new key
	
	Node insertRec(Node root, int key )
	{
		// if tree is empty, return new node
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		
		//return down the tree
		if(key < root.key)
		{
			root.left = insertRec(root.left, key);
		}
		else if(key > root.key)
		{
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	//utility function to do inorder traversal of bst
	
		public void inorderRec(Node root)
		{
			if(root != null)
			{
				inorderRec(root.left);
				System.out.println(root.key);
				inorderRec(root.right);
			}
		}
		
		void inorder()
		{
			inorderRec(root);
		}
}

