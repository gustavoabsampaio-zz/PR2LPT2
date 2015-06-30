import java.awt.*;
import javax.swing.*;

class T2LP2 extends JPanel{
	
	public static void main(String[] args) {
		T2LP2 prata = new T2LP2();
		prata.go();
	}
	public void go(){
		JFrame frame=new JFrame();
		JButton b1 = new JButton("Gustavo");
		JButton b2 = new JButton("Sampaio");
		JButton b3 = new JButton("ERRAR!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.getContentPane().add(b1,BorderLayout.WEST);
		frame.getContentPane().add(b2,BorderLayout.CENTER);
		frame.getContentPane().add(b3,BorderLayout.EAST);
	}
}