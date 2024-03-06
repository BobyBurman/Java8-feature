package BinarySearchTree;

public class BinarySerchTreeDriver {

	public static void main(String[] args) {

		BinarySerachTree myBST = new BinarySerachTree();
		boolean f47=myBST.insert(47);
		boolean f=myBST.insert(27);
		
		System.out.println("Overall 47:::"+f47);
		System.out.println("Overall f:::"+f);
		
		
		
		System.out.println("BST Contains 27:");
        System.out.println(myBST.contains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST.contains(17));


	}

}
