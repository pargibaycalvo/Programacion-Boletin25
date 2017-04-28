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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ped90
 */
public class Saludodam extends JFrame{
    JFrame marco = new JFrame("Saludo");
    JPanel panel = new JPanel();
    JLabel etiq = new JLabel();
    JTextField texto1 = new JTextField("Un saudo a DAM");
    JTextField texto2 = new JTextField("Fin do programa");
    JButton saudo = new JButton("Saudo");
    JButton chao = new JButton("Despedida");
    
    public void mostrar(){
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(saudo);
        panel.add(chao);
        panel.add(etiq);
        marco.add(panel);
        marco.setSize(250,100);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        saudo.addActionListener(new accionBotones());
        chao.addActionListener(new accionBotones());
        
    }
    
public class accionBotones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object obx = e.getSource();
            if(obx==saudo){
                String texto = texto1.getText();
                etiq.setText(texto);
            }
            else if(obx==chao){
                String texto = texto2.getText();
                etiq.setText(texto);
            }
        }
    
}
    
}
