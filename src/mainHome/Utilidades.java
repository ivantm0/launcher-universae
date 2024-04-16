/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainHome;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ivant
 */
public class Utilidades {
    
    public void pequenyo(JLabel labelName, String root){   
        int height = labelName.getIcon().getIconHeight();
        int width = labelName.getIcon().getIconWidth();
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(width-10, height-10, Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        labelName.repaint();
    }
    
    public void grande(JLabel labelName, String root){   
        int height = labelName.getIcon().getIconHeight();
        int width = labelName.getIcon().getIconWidth();
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(width+10, height+10, Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        labelName.repaint();
    }
    
    public void showPanel(JPanel p, JPanel p2){
        p.setSize(p2.getWidth(), p2.getHeight());
        p.setLocation(0, 0);
        p2.removeAll();
        p2.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        p2.revalidate();
        p2.repaint();
    }
    
}
