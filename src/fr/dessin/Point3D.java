package fr.dessin;

public class Point3D extends Point2D{
	
	private int z;

	public Point3D() {
		super();
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "," + this.getZ();
	}
	
	public void translater( int dX, int dY, int dZ) {
		super.translater(dX, dY);
		this.setZ(this.getZ() + dZ);
	}
	
	
	
	
	
	
	
}
