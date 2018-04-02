package view.panel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

///시계패널 내부클래스 /////////////////////////////////////
public class ImgClockPanel extends JPanel implements Runnable {
	Image[] img = new Image[4];
	int i = 2;

	public ImgClockPanel() {
		img[1] = Toolkit.getDefaultToolkit().createImage("img/clock1.png");
		img[2] = Toolkit.getDefaultToolkit().createImage("img/clock2.png");
		img[3] = Toolkit.getDefaultToolkit().createImage("img/clock3.png");
		img[0] = img[1];
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img[0], 0, 0, this);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
				switch (i) {
				case 1:
					img[0] = img[i];
					i = (i + 1) % 4;
					repaint();
					break;
				case 2:
					img[0] = img[i];
					i = (i + 1) % 4;
					repaint();
					break;
				case 3:
					img[0] = img[i];
					i = 1;
					repaint();
					break;
				default:
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}