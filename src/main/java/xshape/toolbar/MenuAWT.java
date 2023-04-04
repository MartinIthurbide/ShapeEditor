package xshape.toolbar;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JToolBar;

public class MenuAWT extends MenuToolBar {

    @Override
    public void buildToolBar() {

        System.out.println("je suis dans menuFX");
        super.awtMenuToolBar = new JToolBar();
        
        super.awtMenuToolBar.add(new Button("test1"));
        super.awtMenuToolBar.add(new Button("test2"));
        super.awtMenuToolBar.add(new Button("test3"));

        super.awtMenuToolBar.setBackground(Color.gray);
        super.awtMenuToolBar.setLocation(0, 0);
    }

    @Override
    public double getLayoutX_ToolBarFX() {
        return super.awtMenuToolBar.getLocation().getX();
    }
    
}
