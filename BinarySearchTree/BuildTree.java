package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	
	int data;
	Node leftNode;
	Node RightNode;
	
	Node(int data){
		this.data=data;
		this.leftNode=null;
		this.RightNode=null;
	}
}

class Tree{
	
	public static int ind=-1;
	
	public static Node buildTree(int[] nodes) {
		ind++;
		if(nodes[ind]==-1) {
			return null;
		}
		Node newNode=new Node(nodes[ind]);
		newNode.leftNode=buildTree(nodes);
		newNode.RightNode=buildTree(nodes);
		
		//System.out.println("newNode.data:::"+newNode.data);

		return newNode;
	}
}


public class BuildTree {
	
	// LevelOrder Traversal Method :: level wise traversal (BFS)
	public static void LevelOrder(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			
			Node currentNode=q.remove();
			
			if(currentNode==null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				System.out.print(currentNode.data+" ");
				if(currentNode.leftNode!=null) {
					q.add(currentNode.leftNode);
				}
				if(currentNode.RightNode!=null) {
					q.add(currentNode.RightNode);
				}
			}
		}
	}
	
	//Pre Order Traversal : root--->left--->right
	public static void PreOrderTraversal(Node root) {
		
		if(root==null) {
			return;
		}
		
		System.out.print(root.data+" ");
		PreOrderTraversal(root.leftNode);
		PreOrderTraversal(root.RightNode);
		
	}
	
	// In Order Traversal : left--->root--->right
	public static void InOrderTraversal(Node root) {

		if (root == null) {
			return;
		}

		InOrderTraversal(root.leftNode);
		System.out.print(root.data + " ");
		InOrderTraversal(root.RightNode);

	}
	
	// Post Order Traversal : left--->right---->root
	public static void PostOrderTraversal(Node root) {

		if (root == null) {
			return;
		}

		PostOrderTraversal(root.leftNode);
		PostOrderTraversal(root.RightNode);
		System.out.print(root.data + " ");

	}
	
	
	//Counts Of Nodes
	public static int CountsOfNodes(Node root) {
		if(root==null) {
			return 0;
		}
		int left=CountsOfNodes(root.leftNode);
		int right=CountsOfNodes(root.RightNode);
		return left+right+1;
	}
	
	
	//Sun Of Nodes Values
	public static int SumOfNodes(Node root) {
		
		if(root==null) {
			return 0;
		}
		int leftSum=SumOfNodes(root.leftNode);
		int rightSum=SumOfNodes(root.RightNode);
		
		return leftSum+rightSum+root.data;
	}
	
	//Height of Tree
	public static int Height(Node root) {
		if(root==null) {
			return 0;
		}
		int leftHeight=Height(root.leftNode);
		int rightHeight=Height(root.RightNode);
		
		return Math.max(leftHeight,rightHeight)+1;
	}
	
	//Diameter of a tree O(n^2)
	public static int Diameter(Node root) {
		if(root==null) {
			return 0;
		}
		
		int d1=Diameter(root.leftNode);
		int d2=Diameter(root.RightNode);
		int d3=Height(root.leftNode)+Height(root.RightNode)+1;
		
		return Math.max(d3,Math.max(d1, d2));
	}
	//Diameter of a tree O(n)
	static class TreeInfo{
		int ht;
		int dia;
		TreeInfo(int ht, int dia){
			this.ht=ht;
			this.dia=dia;
		}
	}
	public static TreeInfo Diameter2(Node root) {
		if(root==null) {
			return new TreeInfo(0, 0);
		}
		
		TreeInfo left=Diameter2(root.leftNode);
		TreeInfo right=Diameter2(root.leftNode);
		int d1=left.dia;
		int d2=right.dia;
		int d3=right.ht+left.ht+1;
		int height=Math.max(right.ht, left.ht)+1;
		
		int d=Math.max(d3, Math.max(d1, d2));
		return new TreeInfo(height,d);
	}
	
	//k nth OrderLevel Traversal Sum
	
	public static int KthSum(int n, Node root) {
		
		if(root==null) {
			return 0;
		}
		
		Queue<Node> q=new LinkedList<Node>();
		
		q.add(root);
		q.add(null);
		
		int c=0;
		int sum=0;
		
		while (!q.isEmpty()) {
			Node currentNode = q.remove();
			
			if(currentNode==null) {
				System.out.println();
				c++;
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				if(c==n-1) {
				sum=sum+currentNode.data;
				}
				System.out.print(currentNode.data+" ");
				if(currentNode.leftNode!=null) {
					q.add(currentNode.leftNode);
				}
				if(currentNode.RightNode!=null) {
					q.add(currentNode.RightNode);
				}
			}
			
		}
		return sum;
	
		
		
	}
	
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		
		Node root=Tree.buildTree(nodes);
		//System.out.println("root.data::::"+root.data);
		//LevelOrder(root);
		//PreOrderTraversal(root);
		//InOrderTraversal(root);
		//PostOrderTraversal(root);
		
		//System.out.println("Counts Of Nodes:::"+ CountsOfNodes(root));
		
		//System.out.println("Sum Of Nodes:::"+ SumOfNodes(root));
		
		//System.out.println("Height of Tree:::"+ Height(root));
		
		//System.out.println("Diameter of Tree:::"+ Diameter(root));
		
		//System.out.println("Diameter of Tree:::"+ Diameter2(root).dia);
		System.out.println("Sum of kth level of a tree :::"+ KthSum(3,root));
	}

}
