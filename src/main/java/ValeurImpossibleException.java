package exercice3;


/**
 * @author relwende
 *
 */
public class ValeurImpossibleException extends Exception {
	/**
     * Constructeur de la classe HorsBornesException.
     * @param message
     */
	public ValeurImpossibleException(String message) {
        super(message);
    }
	

	/**
     * Affecte une valeur dans la grille
     * @param x       position x dans la grille
     * @param y       position y dans la grille
     * @param value   valeur a mettre dans la case
     * @throw ValeurImpossibleException si la valeur est interdite aux vues des autres valeurs de la grille
     */
	@Override
void setValue(int x, int y, char value) throws  ValeurImpossibleException{
	
		 System.out.println(value);
	
	
}


}
