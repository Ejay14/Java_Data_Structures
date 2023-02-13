import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *This class is used to compute and genarate the the time complexities of the find functin of the AVl Tree and,
 *the binary search tree,using data from different files with varying sizes(number of elements in a file are different).
 *@author Jabulani Mavodze
 */

public class TestApp1{
	public static int tmpCount1 = 0;
	public static int tmpCount2 = 0;
	public static String  sf = "text2970.txt";
	public static int q = 2970;
	public static int[] x = new int[q];
	public static int[] y = new int[q];
	public static AVLTree1 aux1 = new AVLTree1();
	public static BST aux2 = new BST();
	public static void main(String[] args){
		
		try{
			String filePath = sf;
		     	Scanner fileinput = new Scanner(new File(filePath));
		     	int i = 0;
		     	int j = 0;
		     	while (fileinput.hasNext()) {
		     		String line = fileinput.nextLine();
		     		String[] temp = line.split(" ",2);
		     		Entry bst = new Entry(temp[0],temp[1]);
		     		aux1.insert(bst);
		     		tmpCount1 = aux1.count;
		     		x[i] = tmpCount1;
		     		aux1.setCount(0);
		     		i++;
		     		aux2.insert(bst);
		     		tmpCount2 = aux2.count;
		     		y[j] = tmpCount2;
		     		aux2.setCount(0);
		     		j++;
		     	}
		     	Write();
		
		    }catch(FileNotFoundException e){
         		System.out.println("file not found");
         	    }
      }
        /**
         *This function computes the average ,the maximum and the minimum.
         */
      
             public static void Write(){
		    	
		   	int max1 = x[0];
		   	for (int i =1;i<q;i++){
		   		if(x[i]> max1){
		   			max1 = x[i];
		   		}
		   	}
		   	int max2 = y[0];
		   	for (int i =1;i<q;i++){
		   		if(y[i]> max2){
		   			max2 = y[i];
		   		}
		   	}
		   	
		   	int sum1 = 0;
		   	for(int i = 0;i<q;i++){
		   		sum1 += x[i];
		   	}
		   	int sum2 = 0;
		   	for(int i = 0;i<q;i++){
		   		sum2 += y[i];
		   	}
		   	   
		   	int ave1 = (Math.abs((sum1/q)));
		   	int ave2 = (Math.abs((sum2/q)));
		   	System.out.println("AVL data");
		        System.out.println(q+" "+x[1]+" "+ave1+" "+max1) ; 
		        System.out.println("Bst data");
		        System.out.println(q+" "+y[1]+" "+ave2+" "+max2) ;						 
		      	
	}
  }   	    
