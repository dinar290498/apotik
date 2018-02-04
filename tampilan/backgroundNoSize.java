/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tampilan;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JPanel;

/**
 *
 * @author SAD
 */
public class backgroundNoSize extends JPanel{
    private Image gam;

    public backgroundNoSize() {
        setOpaque(true);
        gam=new ImageIcon(getClass().getResource("snake_cup.png")).getImage();
    }

    public void setGambar(String gambar){
        try{
            gam=new ImageIcon(getClass().getResource(gambar)).getImage();
            repaint();
        }
        catch(Exception z){};
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(gam, 0,0,null);
        gd.dispose();
    }



}
