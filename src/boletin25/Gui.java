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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ped90
 */
public class Gui extends JFrame{
    JFrame marco = new JFrame("Ej1");
    JPanel panel = new JPanel();
    JLabel etiqueta = new JLabel();
    JTextField texto = new JTextField("Premiches o botón lacasito!!!!");
    JButton boton = new JButton("Preme o botón");
    
    public void mostrar(){
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(boton);
        panel.add(etiqueta);
        marco.add(panel);
        marco.setSize(250,100);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boton.addActionListener(new accionBoton());
        
    }
    
public class accionBoton implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obx = e.getSource();
        if(obx==boton){
            String txt = texto.getText();
            etiqueta.setText(txt);
        }
        else
            etiqueta.setText("*******");
            
        }
        
    }
    
        }
        
    
    
    
    
    
    

