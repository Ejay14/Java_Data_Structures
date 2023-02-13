// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTreeNode<dataType>
{
   Entry data;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;
   int height;
   
   public BinaryTreeNode ( Entry data, BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      this.data = data;
      left = l;
      right = r;
      height = 0;
   }
   
   BinaryTreeNode<dataType> getLeft () { return left; }
   BinaryTreeNode<dataType> getRight () { return right; }
}
