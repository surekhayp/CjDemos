import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Panel, Jframe, button text event example

import javax.swing.*;  
public class PanelExample {  
     PanelExample()  
        {  
        JFrame f= new JFrame("Panel Example");    
        JPanel panel=new JPanel();  
        panel.setBounds(40,80,200,200);    
        panel.setBackground(Color.yellow);  
        final JTextField tf=new JTextField("Hi There.....!!!");  
        tf.setBounds(50,50, 150,200);  
        JButton b1=new JButton("Button 1");     
        b1.setBounds(50,100,80,30);    
        b1.setBackground(Color.red);   
        JButton b2=new JButton("Button 2"); 
        JButton b3=new JButton(new ImageIcon("c:\\Angular.png")); 
        b2.setBounds(100,100,80,30); 
        b3.setBounds(50,50,10,10); 
        b1.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            tf.setText("Welcome to SwingsDemo.");  
        	        }  
        	    });  
        
        b2.setBounds(100,100,80,30);    
        b2.setBackground(Color.green);   
        panel.add(b1); panel.add(b2); panel.add(tf) ;
        panel.add(b3) ;
        f.add(panel);  
                f.setSize(400,400);    
                f.setLayout(null);    
                f.setVisible(true); 
                
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        }  
        public static void main(String args[])  
        {  
        new PanelExample();  
        }  
    }  