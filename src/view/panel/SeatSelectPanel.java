package view.panel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SeatSelectPanel extends JPanel {
	Image image;
	
	public SeatSelectPanel () {
		image = Toolkit.getDefaultToolkit().createImage("img/seatselect.png");
		
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
