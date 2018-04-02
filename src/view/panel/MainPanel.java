package view.panel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

//메인패널 내부클래스///////////////////////////////////////
public class MainPanel extends JPanel {
	Image image;

	public MainPanel() {
		image = Toolkit.getDefaultToolkit().createImage("img/main.png");
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, this);
	}

}
/////////////////////////////////////////////////////