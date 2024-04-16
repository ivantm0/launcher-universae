/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainHome;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
    
    
}
