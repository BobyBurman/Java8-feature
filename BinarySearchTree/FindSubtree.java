package BinarySearchTree;

class Nodee {

	int data;
	Nodee left;
	Nodee right;

	Nodee(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class SubTreeBuilding {
	
	static int  ind = -1;
	
	public static Nodee BuildSubTree(int[] nodes) {
	
		ind++;

		if (nodes[ind] == -1) {
			return null;
		}

		Nodee newNode = new Nodee(nodes[ind]);
		newNode.left = BuildSubTree(nodes);
		newNode.right = BuildSubTree(nodes);
		System.out.println("Sub Tree Node:::::" + newNode.data);
		return newNode;

	}

}

class TreeBuilding {
	
	static int  ind = -1;
	
	public static Nodee BuildTree(int[] nodes) {
	
		ind++;

		if (nodes[ind] == -1) {
			return null;
		}

		Nodee newNode = new Nodee(nodes[ind]);
		newNode.left = BuildTree(nodes);
		newNode.right = BuildTree(nodes);
		System.out.println("Tree Node:::::" + newNode.data);
		return newNode;

	}

}

public class FindSubtree {
	
	public static boolean IsIndentical(Nodee root, Nodee subRoot) {
		
		if(root==null && subRoot==null) {
			return true;
		}
		if(root==null || subRoot==null) {
			return false;
		}
		if(root.data==subRoot.data) {
			return IsIndentical(root.left, subRoot.left) && IsIndentical(root.right, subRoot.right);
		}
		return false;
	}
	public static boolean IsSubTree(Nodee root, Nodee subRoot) {
		
		if(subRoot==null) {
			return true;
		}
		if(root==null) {
			return false;
		}
		if(root.data==subRoot.data) {
			if(IsIndentical(root, subRoot)) {
				return true;
			}
		}
		
		return IsSubTree(root.left, subRoot.left) || IsSubTree(root.right, subRoot.right);
		
	}
	
	public static void main(String[] args) {

		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		int sub[] = {1,2,-1,-1,3,-1,-1};

		Nodee root = TreeBuilding.BuildTree(nodes);
		System.out.println("root.data:::::"+root.data);
		
		Nodee subRoot = SubTreeBuilding.BuildSubTree(sub);
		System.out.println("subRoot.data:::::"+subRoot.data);
		
		
		System.out.println("IsSubTree:::"+IsSubTree(root, subRoot));

	}

}
