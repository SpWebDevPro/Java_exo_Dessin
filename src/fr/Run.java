package fr;

import fr.dessin.Point2D;
import fr.dessin.Point3D;
import fr.dessin.Point3DBis;

public class Run {

	public static void main(String[] args) {
		/*Point2D coord1 = new Point2D();
		coord1.afficher();
		coord1.translater(2, 8);
		coord1.afficher();*/
		
		Point2D coord2 = new Point2D();
		coord2.setX(1);
		coord2.setY(1);
		coord2.afficher();
		coord2.translater(1, 1);
		coord2.afficher();
		
		Point2D coord3 = new Point2D(8,8);
		coord3.afficher();
		coord3.translater(1, 1);
		coord3.afficher();
		
		Point2D.getCompteur();
		
		Point3D coord4 = new Point3D();
		coord4.afficher();
		
		Point3D coord5 = new Point3D(1, 1, 1);
		coord5.afficher();
		coord5.translater(1, 1, 1);
		coord5.afficher();
		
		Point3DBis coord6 = new Point3DBis(0,0,0);
		coord6.translater(2, 2, 1);
		coord6.afficher();
	}
}
