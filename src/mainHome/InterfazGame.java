/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainHome;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.JSONException;

/**
 *
 * @author ivant
 */
public class InterfazGame extends javax.swing.JFrame {
    int indexJuego, indexGrado;
    /**
     * Creates new form NewJFrame
     */
    public InterfazGame() throws IOException, JSONException {
        initComponents();
        
        setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,0));
        BarraTexto.setText(n.devuelveTitulo(indexGrado, indexJuego));
    }
    
    public void setImageLabel(JLabel labelName, String root){
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
            labelName.setIcon(icon);
            this.repaint();
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
        ImagenCarrusel = new javax.swing.JLabel();
        FondoCarruselDcha = new javax.swing.JLabel();
        FondoCarruselIzq = new javax.swing.JLabel();
        FlechaIzq = new javax.swing.JLabel();
        FlechaDcha = new javax.swing.JLabel();
        Punto1 = new javax.swing.JLabel();
        Punto2 = new javax.swing.JLabel();
        Punto3 = new javax.swing.JLabel();
        Punto4 = new javax.swing.JLabel();
        Punto5 = new javax.swing.JLabel();
        Comenzar = new javax.swing.JLabel();
        BarraTexto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenCarrusel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrusel/EPIS0.png"))); // NOI18N
        jPanel1.add(ImagenCarrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        FondoCarruselDcha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cuadrado fondo enfocado.png"))); // NOI18N
        jPanel1.add(FondoCarruselDcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 790, -1));

        FondoCarruselIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cuadrado fondo enfocado.png"))); // NOI18N
        jPanel1.add(FondoCarruselIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 790, -1));

        FlechaIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Flecha izquierda.png"))); // NOI18N
        FlechaIzq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FlechaIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FlechaIzqMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FlechaIzqMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FlechaIzqMousePressed(evt);
            }
        });
        jPanel1.add(FlechaIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        FlechaDcha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Flecha derecha.png"))); // NOI18N
        FlechaDcha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FlechaDcha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FlechaDchaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FlechaDchaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FlechaDchaMousePressed(evt);
            }
        });
        jPanel1.add(FlechaDcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 230, -1, -1));

        Punto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselFilled.png"))); // NOI18N
        jPanel1.add(Punto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, -1, -1));

        Punto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(Punto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 520, -1, -1));

        Punto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(Punto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        Punto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(Punto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        Punto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel1.add(Punto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, -1, -1));

        Comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Comenzar.png"))); // NOI18N
        jPanel1.add(Comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 810, -1, -1));

        BarraTexto.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        BarraTexto.setForeground(new java.awt.Color(255, 255, 255));
        BarraTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Barrita aislada descripción.png"))); // NOI18N
        BarraTexto.setText("Tipología y características de los epis");
        jPanel1.add(BarraTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        jLabel1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de recursos de emergencias y protección civil");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 760, 30));

        jLabel2.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mantenimiento de los equipos y herramientas de extinción de incendios forestales.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 690, 30));

        jLabel3.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("En un campo de prácticas sumido en el desorden y la confusión tienes que encontrar tienes que encontrar y colocar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 760, 30));

        jLabel4.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("las partes de los EPIs utilizados en la extinción de incendios forestales.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 760, 30));

        jLabel5.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("10 minutos.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, 760, 30));

        jLabel6.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Coordinación de emergencias y protección civil.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 760, 30));

        jLabel7.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fácil.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 780, 760, 30));

        jLabel8.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Planificación y supervisión del mantenimiento de equipos, medios técnicos e instalaciones.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 760, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoBase.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, -200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FlechaIzqMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaIzqMousePressed
        cont--;
        
        if(cont == 0){
            cont = 5;
        }
        
        if(cont < 0){
            cont = 4;
        }
                
        if(cont == 1){
            try {
                setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,0));
            } catch (IOException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setImageLabel(Punto1, "src/images/PuntoCarruselFilled.png");
            setImageLabel(Punto2, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto3, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto4, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto5, "src/images/PuntoCarruselEmpty.png");
        }else if(cont == 2){
            try {
                setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,1));
            } catch (IOException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setImageLabel(Punto1, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto2, "src/images/PuntoCarruselFilled.png"); 
            setImageLabel(Punto3, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto4, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto5, "src/images/PuntoCarruselEmpty.png");
        }else if(cont == 3){
            try {
                setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,2));
            } catch (IOException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setImageLabel(Punto1, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto2, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto3, "src/images/PuntoCarruselFilled.png"); 
            setImageLabel(Punto4, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto5, "src/images/PuntoCarruselEmpty.png");
        }else if(cont == 4){
            try {
                setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,3));
            } catch (IOException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setImageLabel(Punto1, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto2, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto3, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto4, "src/images/PuntoCarruselFilled.png"); 
            setImageLabel(Punto5, "src/images/PuntoCarruselEmpty.png");
        }else if(cont == 5){
            try {
                setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,4));
                BarraTexto.setText(n.devuelveTitulo(indexGrado, indexJuego));
            } catch (IOException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setImageLabel(Punto1, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto2, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto3, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto4, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto5, "src/images/PuntoCarruselFilled.png");
        }
    }//GEN-LAST:event_FlechaIzqMousePressed

    private void FlechaDchaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaDchaMousePressed
        cont++;
        if(cont >= 6){
            cont = 1;
        }
        
        if(cont == 1){
            try {
                setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,0));
                
            } catch (IOException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setImageLabel(Punto1, "src/images/PuntoCarruselFilled.png"); 
            setImageLabel(Punto2, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto3, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto4, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto5, "src/images/PuntoCarruselEmpty.png");
        }else if(cont == 2){
            try {
                setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,1));
                BarraTexto.setText(n.devuelveTitulo(indexGrado, indexJuego));
            } catch (IOException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setImageLabel(Punto1, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto2, "src/images/PuntoCarruselFilled.png"); 
            setImageLabel(Punto3, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto4, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto5, "src/images/PuntoCarruselEmpty.png");
        }else if(cont == 3){
            try {
                setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,2));
            } catch (IOException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setImageLabel(Punto1, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto2, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto3, "src/images/PuntoCarruselFilled.png"); 
            setImageLabel(Punto4, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto5, "src/images/PuntoCarruselEmpty.png");
        }else if(cont == 4){
            try {
                setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,3));
            } catch (IOException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setImageLabel(Punto1, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto2, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto3, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto4, "src/images/PuntoCarruselFilled.png"); 
            setImageLabel(Punto5, "src/images/PuntoCarruselEmpty.png");
        }else if(cont == 5){
            try {
                setImageLabel(ImagenCarrusel, n.devuelveImagen(indexGrado, indexJuego,4));
            } catch (IOException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
            }
            setImageLabel(Punto1, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto2, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto3, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto4, "src/images/PuntoCarruselEmpty.png"); 
            setImageLabel(Punto5, "src/images/PuntoCarruselFilled.png");
            cont = 0;
        }
    }//GEN-LAST:event_FlechaDchaMousePressed

    Utilidades n = new Utilidades();
    private void FlechaIzqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaIzqMouseEntered
        n.grande(FlechaIzq, "src/images/Flecha izquierda.png");
    }//GEN-LAST:event_FlechaIzqMouseEntered

    private void FlechaIzqMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaIzqMouseExited
        n.pequenyo(FlechaIzq, "src/images/Flecha izquierda.png");
    }//GEN-LAST:event_FlechaIzqMouseExited

    private void FlechaDchaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaDchaMouseEntered
        n.grande(FlechaDcha, "src/images/Flecha derecha.png");
    }//GEN-LAST:event_FlechaDchaMouseEntered

    private void FlechaDchaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaDchaMouseExited
        n.pequenyo(FlechaDcha, "src/images/Flecha derecha.png");
    }//GEN-LAST:event_FlechaDchaMouseExited

    public JPanel getFondo() {
        return jPanel1;
    }
    
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
            java.util.logging.Logger.getLogger(InterfazGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfazGame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JSONException ex) {
                    Logger.getLogger(InterfazGame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    private int cont = 1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraTexto;
    private javax.swing.JLabel Comenzar;
    private javax.swing.JLabel FlechaDcha;
    private javax.swing.JLabel FlechaIzq;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoCarruselDcha;
    private javax.swing.JLabel FondoCarruselIzq;
    private javax.swing.JLabel ImagenCarrusel;
    private javax.swing.JLabel Punto1;
    private javax.swing.JLabel Punto2;
    private javax.swing.JLabel Punto3;
    private javax.swing.JLabel Punto4;
    private javax.swing.JLabel Punto5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
