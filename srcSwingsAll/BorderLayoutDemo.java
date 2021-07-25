
// Java program to illustrate the BorderLayout

//import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


class testBorderlayout extends JFrame
{
	testBorderlayout()
	{
		  
        // Creating Object of Jpanel class
		JFrame pa=new JFrame();  
  
        // set the layout
        pa.setLayout(new BorderLayout());
  
        // add a new JButton with name "wel" and it is
        // lie top of the container
        pa.add(new JButton("In North"), BorderLayout.NORTH);
  
        // add a new JButton with name "come" and it is
        // lie buttom of the container
        pa.add(new JButton("In South"), BorderLayout.SOUTH);
  
        // add a new JButton with name "Layout" and it is
        // lie left of the container
        pa.add(new JButton("In East"), BorderLayout.EAST);
  
        // add a new JButton with name "Border" and it is
        // lie right of the container
        pa.add(new JButton("In West"), BorderLayout.WEST);
  
        // add a new JButton with name "hello everybody" and it is
        // lie center of the container
        pa.add(new JButton("In the Middle"), BorderLayout.CENTER);
  
        // add the pa object which refer to the Jpanel
        //pa.add(pa);
  
        // Function to close the operation of JFrame.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        // Function to set size of JFrame.
        
  
        // Function to set visible status of JFrame.
        
        pa.setSize(300,300);  
        pa.setVisible(true);  
	}
	}
public class BorderLayoutDemo {

	public BorderLayoutDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new testBorderlayout();
	}

}
