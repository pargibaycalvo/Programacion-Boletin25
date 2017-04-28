/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ped90
 */
public class Ventanas extends JFrame{
    JFrame marco1 = new JFrame("Ventana 1");
    JFrame marco2 = new JFrame("Ventana 2");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JButton boton1 = new JButton("Mostrar Ventana 2");
    JButton boton2 = new JButton("Mostrar Ventana 1");
    
    public void mostrar1(){
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
        panel1.add(boton1);
        marco1.add(panel1);
        marco1.setSize(250,100);
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boton1.addActionListener(new accionBotones());
    }
    
    public void mostrar2(){
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
        panel2.add(boton2);
        marco2.add(panel2);
        marco2.setSize(250,100);
        marco2.setVisible(false);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boton2.addActionListener(new accionBotones());
    }

public class accionBotones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object obx = e.getSource();
            if(e.getSource()==boton1){
                marco2.setVisible(true);
            }
            else if(e.getSource()==boton2){
                marco1.setVisible(true);
                marco2.setVisible(false);
                
                
                
            }
        }
    
}
    
}
