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
public class Cursodam extends JFrame{
    JFrame marco = new JFrame("Curso DAM");
    JPanel panel = new JPanel();
    JButton prog = new JButton("Programación");
    JButton bas = new JButton("Bases");
    
    public void mostrar(){
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(prog);
        panel.add(bas);
        marco.add(panel);
        marco.setSize(250,100);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prog.addActionListener(new accionBotones());
        bas.addActionListener(new accionBotones());
        
        
    }
    
public class accionBotones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object obx = e.getSource();
            if(obx==prog){
                String texto = prog.getText();
                marco.setTitle(texto);
            }
            else if(obx==bas){
                String texto = bas.getText();
                marco.setTitle(texto);
                
        }
            }
            
        }
    
}
    
    

