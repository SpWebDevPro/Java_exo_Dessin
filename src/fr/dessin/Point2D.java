package fr.dessin;

public class Point2D {

	private int x;
	private int y;
	private static  int compteur = 0;
	
	
	
	public Point2D() {
		this(0,0);
	}

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		compteur++;
		
	}

	@Override
	public String toString() {
		return this.getX()+ "," + this.getY();
	}
	
	
	public void afficher() {
		System.out.println("[" + this.toString()+ "]");
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void translater( int dX, int dY) {
		this.x = this.x + dX;
		this.y = this.y + dY;
	}
	
	public static int getCompteur() {
		System.out.println(compteur);
		return compteur;
	}
	
	
}
