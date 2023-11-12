/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celluleLumineuse;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author louis
 */
public class CelluleGraphique extends JButton {
    int largeur; // largeur en pixel de la cellule
 int hauteur; // hauteur en pixel de la cellule
 CelluleLumineuse celluleLumineuseAssociee; 
 // constructeur (appelé depuis FenetrePrincipale)
 public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int l,int h) {
 this.largeur = l;
 this.hauteur = h;
 this.celluleLumineuseAssociee = celluleLumineuseAssociee;
 }
 
 // Methode gérant le dessin de la cellule 
 @Override
 protected void paintComponent(Graphics g) {
 int w = this.getWidth();
 int h = this.getHeight();
 if (celluleLumineuseAssociee.estEteint() == true) {
 g.setColor(Color.red);
 } else {
 g.setColor(Color.yellow);
 }
 g.fillOval(2, 2, w - 4, h - 4);
 Image imageADessiner = null;
 if (celluleLumineuseAssociee.estEteint() == true) {
 imageADessiner = new ImageIcon("imgAllume.png").getImage();
 } else {
 imageADessiner = new ImageIcon("imgEteint.png").getImage();
 }
 // Dessin de l'image dans le composant
 if (imageADessiner != null) {
 g.drawImage(imageADessiner, 0, 0, this);
 }
 }
 }


