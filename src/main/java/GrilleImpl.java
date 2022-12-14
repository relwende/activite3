package exercice3;

import java.util.Arrays;
import java.util.Set;

public class GrilleImpl implements Grille {

	/**
	 * Constantes pour représenter la taille de la grille.
	 */
	private final int taille;

	/*
	 * declaration nommbre ligne et nombre de colonne
	 */
	private int nblign;
	private int nbcol;

	/**
	 * declaration de la Grille.
	 */
	private char[][] grille;

	/** Caractere de case vide */
	char EMPTY = '@';

	/**
	 * Caractere possible a mettre dans la grille pour une grille 4x4 : 1..4 pour
	 * une grille 9x9 : 1..9 pour une grille 16x16: 0..9-a..f pour une grille 25x25:
	 * 0..9-a..o
	 */

	char[] possible = new char[] { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o' };

	/**
	 * Constructeur permettant d'initialiser la grille de sudokou 9x9 ou 16x16 ou
	 * 25x25.
	 *
	 * @param laTaille de la grille de type int.
	 */
	public GrilleImpl(final int laTaille, int l, int c, char ep, char pos[]) {
		this.taille = laTaille;
		this.nblign = l;
		this.nbcol = c;
		this.EMPTY = ep;
		this.possible = pos;
		this.grille = new char[this.nblign][this.nbcol];
		
		for (int i = 0; i < this.taille; i++) {
			for (int j = 0; j < this.taille; j++) {
				this.grille[i][j] = EMPTY;
			}
		}
	}

	/**
	 * Méthode qui retourne la grille.
	 * 
	 * @return char [][]
	 */
	public char[][] getGrille() {
		return grille;
	}

	/**
	 * Méthode pour affecter une grille à variable grille.
	 * 
	 * @param laGrille la grille a affecter.
	 */
	public void setGrille(final char[][] laGrille) {
		// System.arraycopy(laGrille, 0, this.grille, 0, this.getDimension());
		Arrays.fill(laGrille, this.EMPTY);
	}

	/**
	 * @return largeur/hauteur de la grille
	 */

	public int getDimension() {
		return this.nblign * this.nbcol;

	}

	/**
	 * Affecte une valeur dans la grille
	 * 
	 * @param x     position x dans la grille
	 * @param y     position y dans la grille
	 * @param value valeur a mettre dans la case
	 * @throw HorsBornesException si x ou y sont hors bornes (0-8)
	 * @throw ValeurImpossibleException si la valeur est interdite aux vues des
	 *        autres valeurs de la grille
	 * @throw CaractereInterditException si value n'est pas un caractere autorise
	 *        ('1',...,'9')
	 */


	/**
	 * Recupere une valeur de la grille
	 * 
	 * @param x position x dans la grille
	 * @param y position y dans la grille
	 * @return valeur dans la case x,y
	 * @throw HorsBornesException si x ou y sont hors bornes (0-8)
	 */
	@Override
	
	public char getValue(int x,int y) throws HorsBornesException {

		return this.grille[x][y];
		if ((x > 8 && x < 0) || (y > 8 && y < 0)) {

			throw new HorsBornesException("x ou y est hors borne.");
		}

	}

	/**
	 * Test si une grille est terminee
	 * 
	 * @return true si la grille est complete
	 */
	@Override
	
	public boolean complete() {

		for (int i = 0; i < nblign; i++) {

			for (int j = 0; j < nbcol; j++) {
				
                 
				if (this.grille[i][j] != EMPTY) {

					return true;
				}
				return false;
			}

		}

	}

	/**
	 * Test si une valeur est possible dans la grille par rapport a ce qu'elle
	 * contient deja
	 * 
	 * @param x     position x dans la grille
	 * @param y     position y dans la grille
	 * @param value valeur a mettre dans la case
	 * @throw HorsBornesException si x ou y sont hors bornes (0-8)
	 * @throw CaractereInterditException si value n'est pas un caractere autorise
	 *        ('1', ..., '9', ...)
	 */

	@Override
	public boolean possible(int x, int y, char value) throws HorsBornesException, CaractereInterditException {
		
		// On verifie que x et y sont compris dans la borne normal;
		if ((x > 8 && x < 0) || (y > 8 && y < 0)) {

			throw new HorsBornesException("x ou y est hors borne.");
		} 

		// Creation du tableau pour stocker les valeurs
		char[] temp = new char[this.getDimension()];

		// Récupérer les valeurs possibles
		System.arraycopy(possible, 0, temp, 0, this.getDimension());

		// on verifie si value est un caractere autorise.
		boolean bool = false;
		for (char s : temp) {
			if (s == value) {
				bool = true;
				break;
			}
		}
		if (!bool) {
			throw new CaractereInterditException(
					"Cette valeur n'est pas autorisee " + "(parmis les valeurs possibles.)");
		}
		return bool;
	

}
	}
