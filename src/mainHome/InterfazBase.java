/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainHome;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.json.JSONException;

/**
 *
 * @author ivant
 */
public class InterfazBase extends javax.swing.JFrame {

    int indexGrado, indexJuego;
    /**
     * Creates new form LauncherBase
     */
    public InterfazBase() throws IOException, JSONException {
        this.game = new InterfazGame(indexGrado, indexJuego);
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        InterfazHome p = new InterfazHome(indexGrado, indexJuego);
        Utilidades n = new Utilidades();
        n.showPanel(p.getFondo(), contenido);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
            
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Escudo1 = new javax.swing.JLabel();
        Escudo2 = new javax.swing.JLabel();
        Escudo3 = new javax.swing.JLabel();
        Escudo4 = new javax.swing.JLabel();
        Escudo5 = new javax.swing.JLabel();
        Escudo6 = new javax.swing.JLabel();
        Escudo7 = new javax.swing.JLabel();
        Escudo8 = new javax.swing.JLabel();
        Escudo9 = new javax.swing.JLabel();
        Escudo10 = new javax.swing.JLabel();
        Escudo11 = new javax.swing.JLabel();
        Escudo12 = new javax.swing.JLabel();
        Escudo13 = new javax.swing.JLabel();
        Escudo14 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2573, 0, -1, -1));

        Escudo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton0.png"))); // NOI18N
        Escudo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Escudo1MousePressed(evt);
            }
        });
        getContentPane().add(Escudo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        Escudo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton1.png"))); // NOI18N
        Escudo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo2MouseExited(evt);
            }
        });
        getContentPane().add(Escudo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        Escudo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton2.png"))); // NOI18N
        Escudo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo3MouseExited(evt);
            }
        });
        getContentPane().add(Escudo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        Escudo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton3.png"))); // NOI18N
        Escudo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo4MouseExited(evt);
            }
        });
        getContentPane().add(Escudo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        Escudo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton4.png"))); // NOI18N
        Escudo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo5MouseExited(evt);
            }
        });
        getContentPane().add(Escudo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        Escudo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton5.png"))); // NOI18N
        Escudo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo6MouseExited(evt);
            }
        });
        getContentPane().add(Escudo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, -1, -1));

        Escudo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton6.png"))); // NOI18N
        Escudo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo7MouseExited(evt);
            }
        });
        getContentPane().add(Escudo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 90, -1, -1));

        Escudo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton7.png"))); // NOI18N
        Escudo8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo8MouseExited(evt);
            }
        });
        getContentPane().add(Escudo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 90, -1, -1));

        Escudo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton8.png"))); // NOI18N
        Escudo9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo9MouseExited(evt);
            }
        });
        getContentPane().add(Escudo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 90, -1, -1));

        Escudo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton9.png"))); // NOI18N
        Escudo10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo10MouseExited(evt);
            }
        });
        getContentPane().add(Escudo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 90, -1, -1));

        Escudo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton10.png"))); // NOI18N
        Escudo11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo11MouseExited(evt);
            }
        });
        getContentPane().add(Escudo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 90, -1, -1));

        Escudo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton11.png"))); // NOI18N
        Escudo12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo12MouseExited(evt);
            }
        });
        getContentPane().add(Escudo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 90, -1, -1));

        Escudo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton12.png"))); // NOI18N
        Escudo13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo13MouseExited(evt);
            }
        });
        getContentPane().add(Escudo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 90, -1, -1));

        Escudo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escudos/LauncherButton13.png"))); // NOI18N
        Escudo14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo14MouseExited(evt);
            }
        });
        getContentPane().add(Escudo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 90, -1, -1));

        contenido.setBackground(new java.awt.Color(10, 38, 72));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1550, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 1550, 880));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoBase.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Utilidades n = new Utilidades();
    private void Escudo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MouseEntered
        n.grande(Escudo1, "src/images/escudos/LauncherButton0.png");
    }//GEN-LAST:event_Escudo1MouseEntered

    private void Escudo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MouseExited
        n.pequenyo(Escudo1, "src/images/escudos/LauncherButton0.png");
    }//GEN-LAST:event_Escudo1MouseExited

    private void Escudo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo2MouseEntered
        n.grande(Escudo2, "src/images/escudos/LauncherButton1.png");
    }//GEN-LAST:event_Escudo2MouseEntered

    private void Escudo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo2MouseExited
        n.pequenyo(Escudo2, "src/images/escudos/LauncherButton1.png");
    }//GEN-LAST:event_Escudo2MouseExited

    private void Escudo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo3MouseEntered
        n.grande(Escudo3, "src/images/escudos/LauncherButton2.png");
    }//GEN-LAST:event_Escudo3MouseEntered

    private void Escudo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo3MouseExited
        n.pequenyo(Escudo3, "src/images/escudos/LauncherButton2.png");
    }//GEN-LAST:event_Escudo3MouseExited

    private void Escudo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo4MouseEntered
       n.grande(Escudo4, "src/images/escudos/LauncherButton3.png");
    }//GEN-LAST:event_Escudo4MouseEntered

    private void Escudo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo4MouseExited
        n.pequenyo(Escudo4, "src/images/escudos/LauncherButton3.png");
    }//GEN-LAST:event_Escudo4MouseExited

    private void Escudo5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo5MouseEntered
        n.grande(Escudo5, "src/images/escudos/LauncherButton4.png");
    }//GEN-LAST:event_Escudo5MouseEntered

    private void Escudo5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo5MouseExited
        n.pequenyo(Escudo5, "src/images/escudos/LauncherButton4.png");
    }//GEN-LAST:event_Escudo5MouseExited

    private void Escudo6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo6MouseEntered
        n.grande(Escudo6, "src/images/escudos/LauncherButton5.png");
    }//GEN-LAST:event_Escudo6MouseEntered

    private void Escudo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo6MouseExited
        n.pequenyo(Escudo6, "src/images/escudos/LauncherButton5.png");
    }//GEN-LAST:event_Escudo6MouseExited

    private void Escudo7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo7MouseEntered
        n.grande(Escudo7, "src/images/escudos/LauncherButton6.png");
    }//GEN-LAST:event_Escudo7MouseEntered

    private void Escudo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo7MouseExited
        n.pequenyo(Escudo7, "src/images/escudos/LauncherButton6.png");
    }//GEN-LAST:event_Escudo7MouseExited

    private void Escudo8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseEntered
        n.grande(Escudo8, "src/images/escudos/LauncherButton7.png");
    }//GEN-LAST:event_Escudo8MouseEntered

    private void Escudo8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseExited
        n.pequenyo(Escudo8, "src/images/escudos/LauncherButton7.png");
    }//GEN-LAST:event_Escudo8MouseExited

    private void Escudo9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo9MouseEntered
        n.grande(Escudo9, "src/images/escudos/LauncherButton8.png");
    }//GEN-LAST:event_Escudo9MouseEntered

    private void Escudo9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo9MouseExited
        n.pequenyo(Escudo9, "src/images/escudos/LauncherButton8.png");
    }//GEN-LAST:event_Escudo9MouseExited

    private void Escudo10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo10MouseEntered
        n.grande(Escudo10, "src/images/escudos/LauncherButton9.png");
    }//GEN-LAST:event_Escudo10MouseEntered

    private void Escudo10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo10MouseExited
        n.pequenyo(Escudo10, "src/images/escudos/LauncherButton9.png");
    }//GEN-LAST:event_Escudo10MouseExited

    private void Escudo11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo11MouseEntered
        n.grande(Escudo11, "src/images/escudos/LauncherButton10.png");
    }//GEN-LAST:event_Escudo11MouseEntered

    private void Escudo11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo11MouseExited
        n.pequenyo(Escudo11, "src/images/escudos/LauncherButton10.png");
    }//GEN-LAST:event_Escudo11MouseExited

    private void Escudo12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo12MouseEntered
        n.grande(Escudo12, "src/images/escudos/LauncherButton11.png");
    }//GEN-LAST:event_Escudo12MouseEntered

    private void Escudo12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo12MouseExited
        n.pequenyo(Escudo12, "src/images/escudos/LauncherButton11.png");
    }//GEN-LAST:event_Escudo12MouseExited

    private void Escudo13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo13MouseEntered
        n.grande(Escudo13, "src/images/escudos/LauncherButton12.png");
    }//GEN-LAST:event_Escudo13MouseEntered

    private void Escudo13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo13MouseExited
        n.pequenyo(Escudo13, "src/images/escudos/LauncherButton12.png");
    }//GEN-LAST:event_Escudo13MouseExited

    private void Escudo14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo14MouseEntered
        n.grande(Escudo14, "src/images/escudos/LauncherButton13.png");
    }//GEN-LAST:event_Escudo14MouseEntered

    private void Escudo14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo14MouseExited
        n.pequenyo(Escudo14, "src/images/escudos/LauncherButton13.png");
    }//GEN-LAST:event_Escudo14MouseExited

    InterfazGame game;
    private void Escudo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MousePressed
        InterfazHome p;
        try {
            indexGrado = 0;
            p = new InterfazHome(indexGrado, indexJuego);
            n.showPanel(p.getFondo(), contenido);
        } catch (IOException ex) {
            Logger.getLogger(InterfazBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(InterfazBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Escudo1MousePressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfazBase().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazBase.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JSONException ex) {
                    Logger.getLogger(InterfazBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Escudo1;
    private javax.swing.JLabel Escudo10;
    private javax.swing.JLabel Escudo11;
    private javax.swing.JLabel Escudo12;
    private javax.swing.JLabel Escudo13;
    private javax.swing.JLabel Escudo14;
    private javax.swing.JLabel Escudo2;
    private javax.swing.JLabel Escudo3;
    private javax.swing.JLabel Escudo4;
    private javax.swing.JLabel Escudo5;
    private javax.swing.JLabel Escudo6;
    private javax.swing.JLabel Escudo7;
    private javax.swing.JLabel Escudo8;
    private javax.swing.JLabel Escudo9;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
