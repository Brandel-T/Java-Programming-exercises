
public class BinaryTree<T> 
{
	TreeNode<T> root; 
	
	public BinaryTree( ) {
		this(null);
	}
	
	public BinaryTree(TreeNode<T> root) {
		this.root = root; 
	}
	
	public TreeNode<T> getRoot() {
		return root;
	}
	
	public void setRoot(TreeNode<T> root) {
		this.root = root;
	}
	
	public boolean isEmpty() {
		return (root == null) ;
	}
	
	public void inorder() {
		if ( root != null )
			root.inorder(root);
	}
	
	public void preorder() {
		if ( root != null )
			root.preorder(root);
	}
	
	public void postorder() {
		if ( root != null )
			root.postorder(root);
	}
	
	public void levelorder() {
		if ( root != null )
			root.levelorder(root);
	} 
	
	
	
	public int size() {
		return root.count(root);
	}
	
	public int height() {
		return root.getHeight(root);
	}
	
	public int leaves() {
		return root.getLeaves(root);
	} 
	
	
	
}  