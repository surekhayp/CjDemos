
import java.awt.event.*;  
import javax.swing.*;    
public class ButtonExample {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    JButton b2=new JButton(new ImageIcon("c:\\image1.gif"));    
    b2.setBounds(50,150,50, 40);    
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to SwingsDemos ");  
        }  
    });  
    
    b2.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
    	            /*tf.setText("Welcome to SwingsDemos ");  */
    	//	JOptionPane.showMessageDialog(f,"Hello, Welcome to DialogBox");
    		
    		//custom title, warning icon
    	/*	JOptionPane.showMessageDialog(f,
    	              "Your Request has been processesed successfully",
    	              "Alert",JOptionPane.WARNING_MESSAGE);
    */
    		
    		JOptionPane.showMessageDialog(f,
  	              "Your Request has been processesed successfully",
  	              "Alert",JOptionPane.ERROR_MESSAGE);
    	
    		/*int n = JOptionPane.showConfirmDialog(
    			    f,
    			    "Would you like green eggs and ham?",
    			    "An Isnane Question",
    			    JOptionPane.YES_NO_OPTION);
    	*/
    	
    	
    		
    		/*String name=JOptionPane.showInputDialog(f,"Enter Name");      
    		tf.setText(name);*/
    	/*	
    		int result = JOptionPane.showConfirmDialog(f,"Sure? You want to exit?", "Swing Tester",
    	               JOptionPane.YES_NO_OPTION,
    	               JOptionPane.QUESTION_MESSAGE);
    	            if(result == JOptionPane.YES_OPTION){
    	               tf.setText("You selected: Yes");
    	            }else if (result == JOptionPane.NO_OPTION){
    	               tf.setText("You selected: No");
    	            }else {
    	               tf.setText("None selected");
    	            }
    		 */
    		 
    		 
    		 
    		 
    		 
    		 
    		 
    	}
        });  
    
    
    // 
    f.add(b);f.add(tf);
    f.add(b2);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    f.setVisible(true);   
}  
}  