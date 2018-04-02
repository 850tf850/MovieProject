package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import controller.Main;
import view.panel.*;

public class MainFrame extends JFrame {
	Main main;
	
	public MainFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1600,900);
		setVisible(true);
		setTitle("Main Screen");
		setLayout(null);
		setResizable(false);
		//레이아웃
		JLayeredPane layerpane = new JLayeredPane();
		layerpane.setBounds(0,0,1600,900);
		layerpane.setLayout(null);
		//배경패널 
		JPanel mainpanel = new MainPanel();
		mainpanel.setLayout(null);
		mainpanel.setBounds(0,-30,1600,900);
		//시계
		ImgClockPanel imgc = new ImgClockPanel();
		imgc.setLayout(null);
		imgc.setBounds(15,20,179,149);
		imgc.setOpaque(false); //배경투명처리
		new Thread(imgc).start();
		//시간
		MsgClockPanel clockmsg = new MsgClockPanel();
		clockmsg.setBounds(80,53,100,100);
		clockmsg.setOpaque(false);
		new Thread(clockmsg).start();
		//광원처리
		
		//예약패널 
		ReservePanel reservepanel = new ReservePanel(this);
		reservepanel.setLayout(null);
		reservepanel.setBounds(200,100, 1250, 650);
//		reservepanel.setBackground(Color.RED);
		reservepanel.setOpaque(false);
		
		//add
		layerpane.add(mainpanel, new Integer(0));
		layerpane.add(imgc, new Integer(1));
		layerpane.add(clockmsg, new Integer(2));
		layerpane.add(reservepanel, new Integer(3));
		add(layerpane);
	}
	
	
	public void setMain(Main main) {
		// TODO Auto-generated method stub
		this.main = main;
	}
	public Main getMain() {
		return (this.main);
	}
	
	/////////////////////////////////////////
	public static void main(String args[]) {
		new MainFrame();
	}
}
