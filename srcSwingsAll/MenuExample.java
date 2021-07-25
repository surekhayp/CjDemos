
import javax.swing.*;    
import java.awt.event.*;    
public class MenuExample implements ActionListener{    
	JFrame f;    
	JMenuBar mb;    
	JMenu file,edit,help;    
	JMenuItem cut,copy,paste,selectAll;    
	JTextArea ta;    
	MenuExample(){    
		f=new JFrame();    
		cut=new JMenuItem("cut"); 
		cut.setMnemonic(KeyEvent.VK_C);
		cut.setToolTipText("cut text using mthis menu");
		copy=new JMenuItem("copy");   
		copy.setMnemonic(KeyEvent.VK_O);
		paste=new JMenuItem("paste"); 
		KeyStroke ctrlP = KeyStroke.getKeyStroke(KeyEvent.VK_P,
	        InputEvent.CTRL_MASK);
	    paste.setAccelerator(ctrlP);
	selectAll=new JMenuItem("selectAll");    
	cut.addActionListener(this);    
	copy.addActionListener(this);    
	paste.addActionListener(this);    
	selectAll.addActionListener(this);    
	mb=new JMenuBar();    
	file=new JMenu("File");    
	edit=new JMenu("Edit");    
	help=new JMenu("Help");     
	edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);    
	mb.add(file);mb.add(edit);mb.add(help);    
	ta=new JTextArea();    
	ta.setBounds(5,5,360,320);    
	f.add(mb);f.add(ta);    
	f.setJMenuBar(mb);  
	f.setLayout(null);    
	f.setSize(400,400);    
	f.setVisible(true);    
	}     
public void actionPerformed(ActionEvent e) {    
			if(e.getSource()==cut)  
				ta.setText("You clicked cut menu");
			//ta.cut();    
			if(e.getSource()==paste)    
			//ta.paste(); 
			ta.setText("You clicked paste menu");
			if(e.getSource()==copy) 
				ta.setText("You clicked copy menu");
			//ta.copy();    
			if(e.getSource()==selectAll)    
			//ta.selectAll();    
}     
public static void main(String[] args) {    
    new MenuExample();    
}    
}    