/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainHome;

import java.awt.Image;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
    
    public static JSONObject conectar(int indexGrados) throws IOException, JSONException{
        String ruta = "C:\\Users\\ivant\\OneDrive\\Escritorio\\prueba.json";
        String contents = new String(Files.readAllBytes(Paths.get(ruta)));
        JSONObject objetoContenido = new JSONObject(contents);
        JSONArray grados = objetoContenido.getJSONArray("grados");
        JSONObject objetoGrados = grados.getJSONObject(indexGrados);
        return objetoGrados;
    }
    
    public static String devuelveTitulo(int indexGrados, int indexJuegos) throws IOException, JSONException{
        String ruta = "C:\\Users\\ivant\\OneDrive\\Escritorio\\prueba.json";
        String contents = new String(Files.readAllBytes(Paths.get(ruta)));
        JSONObject objetoContenido = new JSONObject(contents);
        JSONArray grados = objetoContenido.getJSONArray("grados");
        JSONObject objetoGrados = grados.getJSONObject(indexGrados);
        JSONArray juegos = objetoGrados.getJSONArray("juegos");
        return juegos.getJSONObject(indexJuegos).getString("titulo");
    }
    
    public static String devuelveImagen(int indexGrados, int indexJuegos) throws IOException, JSONException{
        String ruta = "C:\\Users\\ivant\\OneDrive\\Escritorio\\prueba.json";
        String contents = new String(Files.readAllBytes(Paths.get(ruta)));
        JSONObject objetoContenido = new JSONObject(contents);
        JSONArray grados = objetoContenido.getJSONArray("grados");
        JSONObject objetoGrados = grados.getJSONObject(indexGrados);
        JSONArray juegos = objetoGrados.getJSONArray("juegos");
        String rutaImagen = "src/images/miniaturas/" + juegos.getJSONObject(indexJuegos).getString("imagen") + ".png";
        return rutaImagen;
    }
    
    public static String devuelveRuta(int indexGrados, int indexJuegos) throws IOException, JSONException{
        String ruta = "C:\\Users\\ivant\\OneDrive\\Escritorio\\prueba.json";
        String contents = new String(Files.readAllBytes(Paths.get(ruta)));
        JSONObject objetoContenido = new JSONObject(contents);
        JSONArray grados = objetoContenido.getJSONArray("grados");
        JSONObject objetoGrados = grados.getJSONObject(indexGrados);
        JSONArray juegos = objetoGrados.getJSONArray("juegos");
        return juegos.getJSONObject(indexJuegos).getString("ruta");
    }
    
    public static String devuelveDescripcion(int indexGrados, int indexJuegos) throws IOException, JSONException{
        String ruta = "C:\\Users\\ivant\\OneDrive\\Escritorio\\prueba.json";
        String contents = new String(Files.readAllBytes(Paths.get(ruta)));
        JSONObject objetoContenido = new JSONObject(contents);
        JSONArray grados = objetoContenido.getJSONArray("grados");
        JSONObject objetoGrados = grados.getJSONObject(indexGrados);
        JSONArray juegos = objetoGrados.getJSONArray("juegos");
        return juegos.getJSONObject(indexJuegos).getString("descripcion");
    }
    
}
