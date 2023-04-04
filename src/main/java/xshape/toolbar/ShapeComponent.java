package xshape.toolbar;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;


import xshape.shapes.Shape;

public class ShapeComponent extends Component{
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(50,50,50,50);
    }

    public Dimension getPrDimension(){
        return new Dimension(100,50);
    }
}
