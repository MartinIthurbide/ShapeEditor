package xshape.gui;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import xshape.factory.*;
import xshape.shapes.*;

public abstract class XShape {
    private ShapeFactory _factory = null;
    Shape[] _shapes = null;

    // method factory to delegate instanciation of Shapefactory to subclass
    protected abstract ShapeFactory createFactory();

    // Handler to start the GUI
    public abstract void run();

    private void createScene() {
        Shape shape = _factory.createRectangle(100, 100, 50, 50);
        Shape shape2 = _factory.createRectangle(250, 250, 75, 20);
        Shape polygon = _factory.createPolygon();
        
        //polygon.rotate(60); // Change l'orientation de polygon de 60°
        
        shape.translate(new Point2D.Double(100, 50));
        ShapeGroup gr1 = new ShapeGroup();
        ShapeGroup gr2 = new ShapeGroup();
        gr1.add(shape);
        gr1.add(shape2);
        gr2.add(polygon);

        /* Shape polygonSurMesure = testPolygon();
        gr1.add(polygonSurMesure); */

        Shape[] tmp = { gr1, gr2 };
        _shapes = tmp;
        //System.out.println("Position : " + gr1.getPosition());
        //System.out.println("Size : " + gr1.getSize());
    }

    public void draw() {
        if (_shapes == null) {
            _factory = createFactory();
            createScene();
        }

        for (Shape s : _shapes)
            s.draw();
    }

    /**
     * Récupère la chaine de charactère indiqué par l'utilisateur.
     * @return
     * @throws IOException
     */
    public static String saisieChaine()throws IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String chaine=buff.readLine();
        return chaine;
    }

    private Shape testPolygon(){
        System.out.println("Test polygon (entrer le nombre de points puis les coordonnées de chaque) :");
        ArrayList<Point2D> listPoint= new ArrayList<>();
    
        try {
            
            int nbpoints = Integer.parseInt(saisieChaine());
            System.out.println(" nombre de points de polygone : "+nbpoints);
            System.out.println("entrer les coordonées des points  :");
            double x,y;
            for (int i = 0; i < nbpoints; i++) {
                System.out.println("saisir x numéro "+ i);
                x = Double.parseDouble(saisieChaine());
                System.out.println("saisir y numéro "+ i);
                y = Double.parseDouble(saisieChaine());
                Point2D point = new Point2D.Double(x,y);
                listPoint.add(i,point);
            }
            System.out.println("fin de saisie pour cette scene");
            Shape polygonSurMesure = _factory.createPolygon(listPoint, nbpoints);
            return polygonSurMesure;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

}
