/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.Color;
import java.awt.Graphics;
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
    JTextField texto = new JTextField("0");
    JButton dbj = new JButton("Debuxa");
    JButton lmp = new JButton("Limpar");
    
    public void mostrar(){
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(dbj);
        panel.add(lmp);
        panel.add(texto);
        marco.add(panel);
        marco.setSize(250,100);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
public class accionBotones implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object obx = e.getSource();
            if(obx==dbj){
            Graphics grf = panel.getGraphics();
            for(int i=0;i<Integer.parseInt(texto.getText());i++){                       
                for(int j=0;j<11;j++){                    
                    grf.setColor(new Color(100/(j+1),50/(j+1),255/(i+1)));
                    grf.fillOval(j*30,10+(30*((i*30)/300)), 20, 20);
                     panel.getGraphics().drawOval(j*30,10+(30*((i*30)/300)), 20, 20); 
        }
            }
            }
            else if(obx==lmp){
                    panel.removeAll();
                    }
        }
}
}
