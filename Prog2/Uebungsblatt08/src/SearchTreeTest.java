import java.util.ArrayList;
import java.util.List;

public class SearchTreeTest {

	public static void main(String[] args)
	{ 
		SearchTree<Integer> tree = new SearchTree<>();
		Integer tab[] = {3,1,2,3,4,5,6,7};
		for (Integer i : tab) 
			tree.insert(i);  

		System.out.println("in ... ");
		tree.inorder();
		System.out.println("\npre ... ");
		tree.preorder();
		System.out.println("\npost... ");
		tree.postorder();
		System.out.println("\nlevel ... ");
		tree.levelorder(); 
//		
//		System.out.println( "\nheight: " + tree.height());
//		
//		List<TreeNode<Integer>> list = new ArrayList<>();
//		System.out.println("tree.getRoot(): " + tree.getRoot());
//		tree.readInorder(tree.getRoot(), list);
//		System.out.println(list);
//		
//
//		System.out.println("reorganize ....");
//		tree.reorganize(); 
//		System.out.println("\npost... ");
//		tree.postorder();
		
	}

}
