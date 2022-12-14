package exercice3 ;


/**
* @author relwende
*
*/

public class HorsBornesException extends Exception {
	
	
	/**
     * Constructeur de la classe HorsBornesException.
     * @param message
     */
	public  HorsBornesException (String message) {
	
		super("Message");
      
    }
	
	@Override

 public char getValue(int x, int y) throws HorsBornesException{

  //super.getValue(int x, int y);
  
     return (x,y); 
	}
}
