/**
 *This class is used to create a BstNode object.
 *@author Jabulani Mavodze
 */
public class BstNode {

	public Entry data;
	public BstNode left;
	public BstNode right;
	public int height;
	/**
	 *This is the constructor used to intialise the class intance variable and create a BstNode object.
	 *@param data has  the contets to be store by the node being created.
	 *@param left Is the refrence of the left child node.
	 *@param left Is the refrence of the right child node.
	 */
	public BstNode(Entry data,BstNode left,BstNode right){
		this.data = data;
		this.left = left;
		this.right = right;
		height = 0;
	}
			
}				

	
