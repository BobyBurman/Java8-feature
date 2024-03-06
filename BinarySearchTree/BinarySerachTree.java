package BinarySearchTree;

public class BinarySerachTree {
	
	Node root; //null for the 1st node
	
	//inner class
	class Node{
		
		private Node left;
		private Node right;
		private int value;
		
		Node(int value){
			this.value=value;
		}
	}
	
	public boolean insert(int value) {
		Node newNode=new Node(value);
		
		//checking empty tree
		if(root==null) {
			root=newNode;
			System.out.println("checking empty tree");
			return true;
		}
		
		Node temp=root;
		
		while(true) {
			//checking node value are same or not
			if(newNode.value==temp.value) {
				System.out.println("checking node value are same or not");
				return false;
			}
			
			
			//moving towards left
			if(newNode.value<temp.value) {
				//left branch is null
				if(temp.left==null) {
					temp.left=newNode;
					System.out.println("left branch is null");
					return true;
				}
				//otherwise
				temp=temp.left;
				System.out.println("left branch otherwise");
			
			}else { //moving towards right
				//right branch is null
				if(temp.right==null) {
					temp.right=newNode;
					System.out.println("right branch is null");
					return true;
				}
				//otherwise
				temp=temp.right;
				System.out.println("right branch otherwise");
			}
		}
		
	}
	
	public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
	
	
	
	

}
