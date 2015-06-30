import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

class T2LP2 implements ActionListener{
	JFrame frame;
	MyDrawPanel drawPanel;
	public static void main(String[] args) {
		T2LP2 prata = new T2LP2();
		prata.go();
	}
	public void go(){
		frame=new JFrame();
		drawPanel=new MyDrawPanel();
		
		JPanel p1=new JPanel();
		JButton b1 = new JButton("Gustavo");
		JButton b2 = new JButton("Sampaio");
		JButton b3 = new JButton("ERRAR!");
		b1.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.getContentPane().add(p1,BorderLayout.EAST);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		frame.getContentPane().add(drawPanel,BorderLayout.CENTER);

	}
	public void actionPerformed(ActionEvent event)
	{
		frame.repaint();


	}
	class MyDrawPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			Random random = new Random();
			int x= random.nextInt(300);
			int y= random.nextInt(300);
			int width= random.nextInt(200);
			int height= random.nextInt(200);
			int arcWidth= random.nextInt(200);
			int arcHeight= random.nextInt(200);
			int r= random.nextInt(200);
			int gr= random.nextInt(200);
			int b= random.nextInt(200);
			Color cor = new Color(r,gr,b,60);
			g.setColor(cor);
			g.fillRoundRect(x,y,width,height,arcWidth,arcHeight);
		}
	}

}