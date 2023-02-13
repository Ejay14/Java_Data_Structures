import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *This class is used to compute and genarate the the time complexities of the find functin of the AVl Tree and,
 *the binary search tree,using randomised data from different files with varying sizes(number of elements in a file are different).
 *this class selects 30 random sample each time and te compute and generate the ime complexities.
 *@author Jabulani Mavodze
 */
public class TestApp2{
	public static int tmpCount1 = 0;
	public static int tmpCount2 = 0;
	public static String  sf = "text2970.txt";
	public static int q = 2970;
	public static int[] x = new int[30];
	public static int[] y = new int[30];
	public static String[] z = new String[q]; 
	public static String[] ran = new String[30]; 
	public static AVLTree1 aux1 = new AVLTree1();
	public static BST aux2 = new BST();
	public static void main(String[] args){
		
		try{
			String filePath = sf;
		     	Scanner fileinput = new Scanner(new File(filePath));
		 	int i = 0;
		 	
		 	
		     	while (fileinput.hasNext()) {
		     		String line = fileinput.nextLine();
		     		String[] temp = line.split(" ",2);
		     		String xp = temp[0];
		     		Entry bst = new Entry(temp[0],temp[1]);
		     		z[i] = xp;
		     		aux1.insert(bst);
		     		aux2.insert(bst);
		     		aux1.setCount(0);
		     		aux2.setCount(0);
		     		i++;
		     	}
		     	Read();
		     	Write();
		     	    }catch(FileNotFoundException e){
         		System.out.println("file not found");
         	    }
      }	
      public static void Read(){
    
      	int p = q+1;
      	Random rd = new Random();
      	for (int i = 0;i<30;i++){
      		int rd1 = rd.nextInt(p);
      		ran[i]	= z[rd1];
      	}
      	for(int i =0;i<30;i++){
      		aux1.find(ran[i]);
      		tmpCount1 = aux1.count;
		x[i] = tmpCount1;		
      		aux1.setCount(0);
      		aux2.find(ran[i]);
      		tmpCount2 = aux2.count;
		y[i] = tmpCount2;		
      		aux2.setCount(0);
      	}
     } 
     /**
      *This function computes the average ,the maximum and the minimum.
      */
     public static void Write(){
     	
     	int max1 = x[0];
		   	for (int i =1;i<30;i++){
		   		if(x[i]> max1){
		   			max1 = x[i];
		   		}
		   	}
		   	int max2 = y[0];
		   	for (int i =1;i<30;i++){
		   		if(y[i]> max2){
		   			max2 = y[i];
		   		}
		   	}
		   	
		   	int sum1 = 0;
		   	for(int i = 0;i<30;i++){
		   		sum1 += x[i];
		   	}
		   	int sum2 = 0;
		   	for(int i = 0;i<30;i++){
		   		sum2 += y[i];
		   	}
		   	   
		   	int ave1 = (Math.abs((sum1/30)));
		   	int ave2 = (Math.abs((sum2/30)));
		   	System.out.println("AVL data");
		        System.out.println(q+" "+1+" "+ave1+" "+max1) ; 
		        System.out.println("Bst data");
		        System.out.println(q+" "+1+" "+ave2+" "+max2) ;						 
		      	
	}
  }
