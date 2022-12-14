package exercice3;

	/**
	 * Interface de résolveur de Grille
	 *
	 * @author relwende
	 */
	public interface Solveur {
	    /**
	     * Résoud une Grille
	     *
	     * @param grille Grille à résoudre
	     * @return true si la grille a été résolue
	     */
	    boolean solve(Grille grille);
	}


