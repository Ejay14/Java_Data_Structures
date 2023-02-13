/**
 *This class is used to create an AVL Tree
 *@author Jabulani Mavodze
 */
public class AVLTree1{
   int count ;
   BstNode root;
   /**
    *Default constructor used to initialise the instance variables.
    */
   public AVLTree1(){
   	root = null;
   	count = 0;
   }
    /**
     *Setter method used to set the value of the count instance variable.
     *@param x  integer value assigned to count.
     *@return the function returns an integer value.
     */
   
   public int setCount(int x){
   	return count = x;
   }	
   /**
   *This function returns the height of the node provided as the parameter. 
   *@param node Is  the Node that  we want the height of.
   *return this function returns an integer value.
   */
   public int height ( BstNode node )
   {
      if (node != null)
         return node.height;
      return -1;
   }
   /**
    *This method checks if a tree is balanced or not.
    *@param node is the node to be used to check if a tree is ballanced.
    @return this function returns an integer value .
    */
   
   public int balanceFactor ( BstNode node )
   {
      return height (node.right) - height (node.left);
   }
   /**
    *This method is used to check if the height difference of the subtrees is not greater than 1 and 0 , or less than -1.
    *@param node is th parent node of the subtrees being checked for height difference.
    */
   public void fixHeight ( BstNode node )
   {
      node.height = Math.max (height (node.left), height (node.right)) + 1;
   }
   /**
    *This method is used to rotate nodes to the right.
    *@param p is the root node with unbalance subtrees.
    *@return This method returns a new root node.
    */
   public BstNode rotateRight ( BstNode p )
   {
      BstNode q = p.left;
      p.left = q.right;
      q.right = p;
      fixHeight (p);
      fixHeight (q);
      return q;
   }
   /**
    *This method is used to rotate nodes to the left.
    *@param p is the parent node with unbalance subtrees.
    *@return This method returns a new parent node.
    */
   public BstNode rotateLeft ( BstNode q )
   {
      BstNode p = q.right;
      q.right = p.left;
      p.left = q;
      fixHeight (q);
      fixHeight (p);
      return p;
   }
   /**
    *This method is used to balance trees that are found to be unbalance.
    *@param p is the parent node.
    *@return This method returns a new parent node with balance subtrees.
    */
   
   public BstNode balance ( BstNode p )
   {
      fixHeight (p);
      if (balanceFactor (p) == 2)
      {
         if (balanceFactor (p.right) < 0)
            p.right = rotateRight (p.right);
         return rotateLeft (p);
      }
      if (balanceFactor (p) == -2)
      {
         if (balanceFactor (p.left) > 0)
            p.left = rotateLeft (p.left);
         return rotateRight (p);
      }
      return p;
   }
   /**
    *Helper insert method used to insert a node into an AVL Tree.
    *@param data Is the node that is going being inserted into the Binary Search Tree.
    */
   public  void insert(Entry data){
         	if (root == null){
         		root = new BstNode (data, null, null);
         	}
         	else{
         		root = insert (data, root);
         	}
    }
     /**
      *The primary insert method used to insert a node into an AVL Tree.
      *@param d  An object of type Enytry that contains the data that is going to be used when inserting its node.
      *@param node  The root node of the Binary Search Tree we want to insert to.
      *@return This method returns a new root node after insertion.
      */ 
   public BstNode insert ( Entry d, BstNode node )
   {  
     
      if (node == null){
         return new BstNode (d, null, null);
      }
      count++;   
      if ((d.getTheKey()).compareTo ((node.data).getTheKey()) <= 0){
         node.left = insert (d, node.left);
         return balance(node);
      }   
      else{
         node.right = insert (d, node.right);
      return balance (node);
     } 
   }
   /**
    *Helper find method used to find/search for an element in an AVL Tree.
    *@param d -> Is the string used to search for an element in an AVL Tree.
    */
   public BstNode find ( String d )
   {
      if (root == null)
         return null;
      else
         return find (d, root);
   }
   /**
    *The primary find method used to to find/search for an element in an AVL Tree.
    *@param d  Is the string used to search for an element in an AVL Tree.
    *@return  The method returns a node of type BstNode,that contains the data with the string provided.
    */   
   public BstNode find ( String d, BstNode node )
   {  
	     	
	      if (d.compareTo ((node.data).getTheKey()) == 0) {
	      	  count++;
		 return node;
	      } 
	      	  
	      if (d.compareTo ((node.data).getTheKey()) < 0){
	      	 count++;	
		 return (node.left == null) ? null : find (d, node.left);
	      }   
	      else{
		 return (node.right == null) ? null : find (d, node.right);
	      } 
			        
   }
   /**
    *The visit method is used as a helper method to print the elements in an AVL Tree.
    *@param  node Is the node that contains contents that are to be printed.
    */   
   public void visit(BstNode node ){
         	System.out.println((node.data).getTheKey()+" "+(node.data).getAreas());
   }
   /**
    *The inOrder method is used to print elements in an AVL Tree in an ordered manner.
    *@param node Is the node that contains contents that are to be printed.
    */   
   public void inOrder (){
   	inOrder(root);
   }
   public void inOrder ( BstNode node ){
   	if (node != null){
   		inOrder (node.left);
   		visit (node);
   		inOrder (node.right);
   	}
   }
   /**
    *The getter method used to get the  value of  count.
    *@retrun This method returns an integer value.
    */   
   public int Count(){ return count;}			
   		
}

