import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Panel extends JPanel{
	public Panel(){
		setPreferredSize(new Dimension(1200, 1600));
		setLayout(null);
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.fillRect(0, 0, 50, 50);
	}
}
