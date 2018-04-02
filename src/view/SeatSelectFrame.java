package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import view.panel.SeatPanel;
import view.panel.SeatSelectPanel;

public class SeatSelectFrame extends JFrame {

	public SeatSelectFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1600, 900);
		setVisible(true);
		setTitle("Seat Select Screen");
		setLayout(null);
		setResizable(false);

		// 레이아웃
		JLayeredPane layerpane = new JLayeredPane();
		layerpane.setBounds(0, 0, 1600, 900);
		layerpane.setLayout(null);
		
		// 배경패널
		JPanel seatSltPanel = new SeatSelectPanel();
		seatSltPanel.setLayout(null);
		seatSltPanel.setBounds(0, -30, 1600, 900);
		
		//seat패널
		SeatPanel seatpanel = new SeatPanel();
		seatpanel.setLayout(null);
		seatpanel.setBounds(200,160, 1250, 600);
//		seatpanel.setBackground(Color.RED);
		seatpanel.setOpaque(false);

		//add
		layerpane.add(seatSltPanel, new Integer(0));
		layerpane.add(seatpanel, new Integer(1));
		add(layerpane);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
