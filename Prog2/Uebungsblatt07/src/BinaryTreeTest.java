import java.util.ArrayList;

public class BinaryTreeTest<T extends Comparable<T>> extends BinaryTree<T>
{
	public boolean insert(TreeNode<T> node, BinaryTree<T> tree)
	{

		if (tree.getRoot() == null) {
			tree.setRoot(node);
			return true;
		} 
		else
		{
			TreeNode<T> currentRoot = tree.getRoot();
			 while ( currentRoot != null ) 
			 {
				 int sign = currentRoot.getKey().compareTo(node.getKey());
				 if ( sign == 0 ) 
				 {
					 return true;
//					 return false;
				 } else {
					 if ( sign > 0 ) {
						 if ( currentRoot.getLeft() == null ) {
							 currentRoot.setLeft(node);
						 } else {
							 currentRoot = currentRoot.getLeft();
						 }
					 }
					 else 
					 {
						 if ( sign < 0) {
							 if ( currentRoot.getRight() == null ) {
								 currentRoot.setRight(node);
							 } else {
								 currentRoot = currentRoot.getRight();
							 }
						 }
					 }
				 } 
			 }
			 
			 return true; 
		} 
	}
	
	
	
	public static void main(String[] args)
	{
		ArrayList<TreeNode<Integer>> nodes = new ArrayList<>();
		nodes.add(new TreeNode<Integer>(4));
		nodes.add(new TreeNode<Integer>(2));
		nodes.add(new TreeNode<Integer>(6));
		nodes.add(new TreeNode<Integer>(8));
		nodes.add(new TreeNode<Integer>(9));
		nodes.add(new TreeNode<Integer>(7));
		nodes.add(new TreeNode<Integer>(5));
		nodes.add(new TreeNode<Integer>(3));
		nodes.add(new TreeNode<Integer>(1)); 
	
		BinaryTreeTest<Integer> b = new BinaryTreeTest<>();
		BinaryTree<Integer> bt = new BinaryTree<Integer>(); //empty tree
		
		for ( TreeNode<Integer> node : nodes ) {
			System.out.println(b.insert(node, bt)); 
		}
		
		bt.inorder();
		System.out.println();
		bt.preorder();
		System.out.println();
		bt.postorder();
		System.out.println();
		bt.levelorder();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
