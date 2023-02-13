/**
 *This class is used to create a Binary Search Tree 
 *@author Jabulani Mavodze
 */
public  class BST{
	public int count ;
	public BstNode root;
	/**
	 *Default constructor used to initialise the instance variables.
	 */
	public BST (){
		root = null;
		count = 0;
	}
	 /**
	  *Setter method used to set the value of the count instance variable.
	  *@param x -> integer value assigned to count.
	  *@return the function returns an integer value.
	  */ 
	public int setCount(int x){
   		return count = x;
        }
        /**
         *Helper insert method used to insert a node into a Binary Search Tree.
         *@param data -> A node that is going being inserted into the Binary Search Tree.
         */
        public  void insert(Entry data){
         	if (root == null){
         		root = new BstNode (data, null, null);
         	}
         	else{
         		insert (data, root);
         	}
         }
         /**
          *The primary insert method used to insert a node into a binary search tree.
          *@param d -> An object of type Enytry that contains the data that is going to be used when inserting its node.
          *@param node -> The root node of the Binary Search Tree we want to insert to.
          */  
      public void insert ( Entry d, BstNode node ){ 
      count++;   
      if ((d.getTheKey()).compareTo ((node.data).getTheKey()) <= 0){
        {
         if (node.left == null)
            node.left = new BstNode (d, null, null);
         else
            insert (d, node.left);
       }
     } 
     else
      {
         if (node.right == null)
            node.right = new BstNode (d, null, null);
         else
            insert (d, node.right);
      }
    }
    
   /**
    *Helper find method used to find/search for an element in a Binary search Tree.
    *@param d -> Is the string used to search for an element in a Binary search Tree.
    */
  public BstNode find ( String d )
   {
      if (root == null)
         return null;
      else
         return find (d, root);
   }
   /**
    *The primary find method used to to find/search for an element in a Binary search Tree.
    *@param d -> Is the string used to search for an element in a Binary search Tree.
    *@return -> The method returns a node of type BstNode,that contains the data with the string provided.
    */  
   public BstNode find ( String d, BstNode node )
   {  
	      count++;	
	      if (d.compareTo ((node.data).getTheKey()) == 0) {
	      	 
		 return node;
	      } 
	      count++;	  
	      if (d.compareTo ((node.data).getTheKey()) < 0){
	      	 	
		 return (node.left == null) ? null : find (d, node.left);
	      }   
	      else{
		 return (node.right == null) ? null : find (d, node.right);
	      } 
			        
   }
   /**
    *The visit method is used as a helper method to print the elements in the Binary search tree.
    *@param  -> node is the node that contains contents that are to be printed.
    */
    public void visit(BstNode node ){
         	System.out.println((node.data).getTheKey()+" "+(node.data).getAreas());
         }
   /**
    *The inOrder method is used to print elements in a Binary search tree an ordered manner.
    *@param  -> node is the node that contains contents that are to be printed.
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
    *@retrun -> This method return an integer value.
    */
   public int Count(){ return count;}			
   		
}

	
