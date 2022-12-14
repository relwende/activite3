package exercice3;

public class ValeurInitialeModificationException  extends Exception{
	
	/**
     * Constructeur de la classe ValeurInitialeModificationException
     * @param message
     */
	public ValeurInitialeModificationException(String message) 
	{
        super(message);
    }
	
	/**
     * Affecte une valeur dans la grille
     * @param x       position x dans la grille
     * @param y       position y dans la grille
     * @param value   valeur a mettre dans la case
     * @throw exception levée lorsqu’on cherche à modifier une valeur initiale de la grille
     */
	@Override
	public char setValue(int x, int y, char value) throws ValeurInitialeModificationException {
       System.out.println(value);
		
	}
	
	
}
