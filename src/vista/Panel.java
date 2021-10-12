package vista;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel(){
        this.setSize(1200,200);
        this.setVisible(true);
        this.setBackground(Color.darkGray);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new java.awt.Font("Arial", 0, 50));
        g.setColor(Color.WHITE);
        g.drawString("SISTEMA DE ALQUILER DE AUTOS",150,100);
    }
}
