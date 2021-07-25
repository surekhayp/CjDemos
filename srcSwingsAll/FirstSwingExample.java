import javax.swing.*;  
import java.awt.event.*;  
public class FirstSwingExample {

	public FirstSwingExample() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		 JFrame f=new JFrame("Button Example");  
		    final JTextField tf=new JTextField();  
		    tf.setBounds(50,50, 150,20);  
		    JButton b=new JButton("Click Here");  
		    b.setBounds(50,100,95,30);  
		    
		    //hot keys -ALt with C
		    b.setMnemonic(KeyEvent.VK_C);
		    b.setToolTipText("This is button in java");
		    
		    
		    
		    b.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
		            tf.setText("Welcome to Swings in Java.");  
		        }  
		    });  
		    f.add(b);
		    f.add(tf);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		    f.setVisible(true);  
		    
	}

}
