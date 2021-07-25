import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel; 

import javax.swing.JFrame;; 


public class JFrameExample 
{  
	public static void JFramedemo()
	{
		JFrame frame = new JFrame("JFrame Example");  //container -window like
        JPanel panel = new JPanel();  //container only that holds the obejcts
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("JFrame By Example");  
        JButton button = new JButton();  
        button.setText("Click It!!!!!"); 
        
        
        button.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){  
    			label.setText("Welcome to Swings in Java.");  
    		        }  
    		    });
        
        panel.add(label);  
        panel.add(button);  
        frame.add(panel);  
        frame.setSize(400, 300);  
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
	}
    public static void main(String s[]) 
    {  
    	JFrameExample.JFramedemo();
    }  
}  


/*b.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
		            tf.setText("Welcome to Swings in Java.");  
		        }  
		    }); */ 