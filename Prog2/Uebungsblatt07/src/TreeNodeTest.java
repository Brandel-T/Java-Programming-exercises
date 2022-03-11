import java.util.ArrayList;

public class TreeNodeTest 
{
	public static void main(String[] args) 
	{
		TreeNode<Integer> n6 = new TreeNode<Integer>(6);
		TreeNode<Integer> n11 = new TreeNode<Integer>(11);
		TreeNode<Integer> n4 = new TreeNode<Integer>(4, n6, n11);
		TreeNode<Integer> n5 = new TreeNode<Integer>(5);
		TreeNode<Integer> n7 = new TreeNode<Integer>(7);
		TreeNode<Integer> n1 = new TreeNode<Integer>(1, n5, n7);
		TreeNode<Integer> root = new TreeNode<Integer>(8, n4, n1);
		
		System.out.println("\nExercise 3 :");
		root.inorder(root);
		System.out.println();
		root.preorder(root);
		System.out.println();
		root.postorder(root);
		System.out.println();
		root.levelorder(root);
		 
		System.out.println( root.count(root) );  
		System.out.println( root.getHeight(root) ); 
		System.out.println( root.getLeaves(root) );
		
		
		//4. Exercise
		System.out.println("\n\n\nExercise 4 : ");
		BinaryTree<Integer> bt2 = new BinaryTree<Integer>(root);
		
		bt2.inorder();
		System.out.println();
		bt2.preorder();
		System.out.println();
		bt2.postorder();
		System.out.println();
		bt2.levelorder();
		
//		System.out.println("\n\n");
//		bt2.setRoot(n6);
//		bt2.inorder();
//		System.out.println();
//		bt2.setRoot(n4);
//		bt2.inorder();
		

		System.out.print("la profondeur : ");
		System.out.println( bt2.height( ) );
		System.out.print("les feuilles : ");
		System.out.println( bt2.leaves( ) ); 
		System.out.print("le decompte : "); 
		System.out.println(bt2.size( ) ); 	
		
	}

}
