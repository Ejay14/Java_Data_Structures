import java.io.*;
import java.util.*;
/**
 *This class is used to create an AVL Tree using real world data (City of Cape Town's  loadshedding data). 
 *@author Jabulani Mavodze
 */
public class LSAVLTreeApp{
	public static int tmpCount = 0;
	public static AVLTree1 aux = new AVLTree1();
        /**
	 *This method is used to run the program.
	 *@param args 
	 */	
	public static void main(String[] args){
		
		try{
			String filePath = "Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt";
		     	Scanner fileinput = new Scanner(new File(filePath));
		     	while (fileinput.hasNext()) {
		     		String line = fileinput.nextLine();
		     		String[] temp = line.split(" ",2);
		     		Entry bst = new Entry(temp[0],temp[1]);
		     		aux.insert(bst);
		     		tmpCount = aux.count;
		     		aux.setCount(0);
		     	}
		
		   
		     if(args.length==0){
		    	 printAllAreas(aux.root);
		    }
		    else if (args.length==3){	 
		     	printAreas(args[0],args[1],args[2]);
		    }	
		    else{
		     	System.out.println("Entry not found : "+" and "+"The count is:{"+aux.count+"}");
		    }
		    
		    }catch(FileNotFoundException e){
         		System.out.println("file not found");
         	    } 
        } 
        /**
         *This methid is used to print all Areas in the Binary Search Tree,if no key is provided.
         *@param node is the root Node of the Binary Search Tree.
         */       
        public static void printAllAreas(BstNode node){
		
			aux.inOrder();
		
	}
       /**
	*This method is used to print tge Areas that correspond with the key provided.
	*@param stage Is the stage of the loadshdding.
	*@param day Is the Day on which the loadshedding will occur.
	*@param startTime Is the time when the loadshedding will start to occur.
	*/
		
	public static void printAreas(String stage,String day,String startTime){
		String newString1 = stage+"_"+day+"_"+startTime;
		BstNode ans = aux.find(newString1,aux.root);
		if (ans != null ){
			System.out.println("The Areas are/is: ["+(ans.data).getAreas() +"] and "+"The count is:{"+ aux.count+"} ");
		}
	}		    
}         	    	
