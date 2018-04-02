package controller;

import javax.swing.JFrame;

import view.LoginFrame;
import view.MainFrame;
import view.SeatSelectFrame;

public class Main {

//	 static String frameFlag = Main.class.getName();
	 
//	SeatSelectFrame seatSelectFrame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		MainFrame mainFrame = new MainFrame();
		mainFrame.setMain(main);
//		System.out.println("현재 프레임 상태 : " + Main.frameFlag);
	}
	public void mainframeTOloginframe(JFrame preFrame) {
		preFrame.dispose();
		LoginFrame loginframe = new LoginFrame();
	}
	public void mainframeTOseatselectframe(JFrame preFrame) {
		preFrame.dispose();
		SeatSelectFrame seatselctframe = new SeatSelectFrame();
	}

}
