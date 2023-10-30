package fr.dessin;

public class Point3DBis {
	
	private Point2D p;
	private int z;
	
	public Point3DBis() {
		this(0,0,0);
	}

	public Point3DBis(int x, int y, int z) {
		super();
		this.p = new Point2D(x, y);
		this.z = z;
	}

	public int getX() {
		return this.p.getX();
	}
	
	public void setX(int x) {
		this.p.setX(x);
	}
	
	public int getY() {
		return this.p.getY();
	}
	
	public void setY(int y) {
		this.p.setY(y);
	}

	public int getZ() {
		return this.z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	

	public void translater(int x, int y, int z) {
		this.p.translater(x,y);
		this.setZ(this.getZ() + z);
	}
	
	
	@Override
	public String toString() {
		return p.toString() + "," + this.getZ();
	}

	public void afficher() {
		System.out.println("[" + this.toString()+ "]");
	}
	
	
	
	

}
