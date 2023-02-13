/**
 *This class is used to create an Entry object.
 *@author Jabulani Mavodze
 */

public class Entry  {

        //Instance variables// 
	private String theKey;
	private String Areas;
	
	/**
	 *Constructor used to initialise the class instance variables and create an Entry object.
	 *@param theKey Is used to store the first string of the loadshedding data(i.e it omits the string after the empty  space)
	 *@param Areas Is used to store the second string  of the loadshedding data(i.e it omits the string before the empty  space)
	 */
	public Entry(String theKey,String Areas){
		this.theKey = theKey;
		this.Areas = Areas;
	}
	
	/**
	 *Getter Method used to get the value of theKey instance variable.
	 */ 
	public String getTheKey(){
		return this.theKey;
	}
        /**
	 *Getter Method used to get the value of Areas instance variable.
	 */ 	
	public String getAreas(){
		return this.Areas;
	}
				
			
}	
				
	
		
