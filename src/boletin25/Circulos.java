/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ped90
 */
public class Circulos {
    JFrame marco = new JFrame("Circulos");
    JPanel panel = new JPanel();
    JPanel pane2 = new JPanel();
    JTextField texto = new JTextField("0");
    JButton dbj = new JButton("Debuxa");
    JButton lmp = new JButton("Limpar");
    boolean Debuxa = false;
    
    public void mostrar(){
        
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(dbj);
        panel.add(lmp);
        texto.setBounds(new Rectangle(25, 15, 250, 21));
        panel.add(texto);
        marco.add(panel);
        marco.setSize(500,500);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
public abstract class accionBotones implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            
            Object obx = e.getSource();
            if(obx==dbj){
                Debuxa=true;
            }
            else if(obx==lmp){
                Debuxa=false;
            }                 
        }
        
        public void debuxaCirculos(Graphics g){
            if(Debuxa){
                g.setColor (Color.red);
                int circulos=Integer.parseInt(texto.getText());
                for(int c=1;c<=circulos;c++){
                    int x1 = (int) (Math.random()*100)+60;
                    int y1 = (int) (Math.random()*100)+80;
                    g.drawOval(300, 250, 50, 70);
                }
        }
            else{
                g.setColor(Color.white);
                g.fillRect(0, 0, 200, 200);
            }
}
}
}
